package com.minjikim.codecobainbackend.controller;

import com.minjikim.codecobainbackend.dto.response.AiPredictionResponse;
import com.minjikim.codecobainbackend.service.AiAnalysisService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/wafer")
@RequiredArgsConstructor
public class WaferAnalysisController {

    private final AiAnalysisService aiAnalysisService;

    /**
     * 샘플 이미지 파일명을 기준으로 분석 요청을 수행하는 테스트용 엔드포인트
     *
     * @param filename 이미지 파일명 (예: defect1.jpg)
     * @return AI 분석 결과 (결함 여부 및 신뢰도)
     */
    @GetMapping("/analyze")
    public AiPredictionResponse analyzeWafer(@RequestParam String filename) {
        return aiAnalysisService.analyze(filename);
    }
}

