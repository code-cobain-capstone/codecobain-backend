package com.minjikim.codecobainbackend.service;

import com.minjikim.codecobainbackend.dto.response.AiPredictionResponse;
import com.minjikim.codecobainbackend.exception.AiServerException;
import com.minjikim.codecobainbackend.exception.FileProcessingException;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
//import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
@RequiredArgsConstructor
public class AiAnalysisService {

    private final RestTemplate restTemplate;
    //private final RedisTemplate<String, String> redisTemplate;

    @Value("${ai.server.url}${ai.endpoint.predict}")
    private String aiUrl;

    @Value("${file.upload-dir}")
    private String uploadDir;

    private static final Logger logger = LoggerFactory.getLogger(AiAnalysisService.class);
    //private static final String REDIS_KEY_PREFIX = "analysis:";

    public AiPredictionResponse analyze(String filename) {
        try {
            Path imagePath = Paths.get(uploadDir, filename);

            if (!Files.exists(imagePath)) {
                logger.warn("이미지 파일이 존재하지 않음: {}", imagePath);
                //updateAnalysisStatus(filename, "FAILED");
                throw new FileProcessingException("이미지가 존재하지 않음");
            }

            Resource imageResource = new FileSystemResource(imagePath);

            //updateAnalysisStatus(filename, "PROCESSING");

            HttpEntity<MultiValueMap<String, Object>> request = createRequest(imageResource);
            ResponseEntity<AiPredictionResponse> response = sendRequest(request);

            validateResponse(response);
            logger.info("AI 분석 결과: {}", response.getBody());
            //updateAnalysisStatus(filename, "COMPLETED");

            return response.getBody();

        } catch (Exception e) {
            logger.error("AI 분석 중 오류 발생: {}", e.getMessage());
            //updateAnalysisStatus(filename, "FAILED");
            throw new AiServerException("AI 분석 실패", e);
        }
    }

    private HttpEntity<MultiValueMap<String, Object>> createRequest(Resource image) {
        MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
        body.add("file", image);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);

        return new HttpEntity<>(body, headers);
    }

    private ResponseEntity<AiPredictionResponse> sendRequest(HttpEntity<?> request) {
        return restTemplate.exchange(
                aiUrl,
                HttpMethod.POST,
                request,
                AiPredictionResponse.class
        );
    }

    private void validateResponse(ResponseEntity<?> response) {
        if (!response.getStatusCode().is2xxSuccessful()) {
            throw new AiServerException("AI 서버 응답 오류: " + response.getStatusCode());
        }
    }

    /*private void updateAnalysisStatus(String imageId, String status) {
        redisTemplate.opsForValue().set(
                REDIS_KEY_PREFIX + imageId,
                status,
                Duration.ofMinutes(30)
        );
    }
    */
}
