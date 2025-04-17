package com.minjikim.codecobainbackend.controller;

import com.minjikim.codecobainbackend.dto.response.AiPredictionResponse;
import com.minjikim.codecobainbackend.service.AiAnalysisService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/ai")
@RequiredArgsConstructor
public class AiPredictionController {

    private final AiAnalysisService aiAnalysisService;

    @PostMapping("/predict")
    public AiPredictionResponse predictImage(@RequestParam("file") MultipartFile file) throws IOException {
        // MultipartFile로 받은 파일을 분석 요청
        return aiAnalysisService.analyze(file);  // 이미지를 분석하고 결과를 반환
    }

    @ExceptionHandler(IOException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleIOException(IOException ex) {
        return "파일 처리 중 오류가 발생했습니다: " + ex.getMessage();
    }
}
