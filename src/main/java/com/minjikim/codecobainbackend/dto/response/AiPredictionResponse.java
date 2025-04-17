package com.minjikim.codecobainbackend.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AiPredictionResponse(
        @JsonProperty("prediction") String prediction,
        @JsonProperty("confidence") double confidence
) { }
