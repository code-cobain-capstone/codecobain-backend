package com.minjikim.codecobainbackend.service;
/*
import com.fasterxml.jackson.databind.ObjectMapper;
import com.minjikim.codecobainbackend.dto.request.SensorDataRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
/*
@Profile("sensor")
@Slf4j
@Service
@RequiredArgsConstructor
public class SensorMqttService {

    private final MqttClient mqttClient;
    private final ObjectMapper objectMapper;
    private final SensorDataService sensorDataService;

    @PostConstruct
    public void subscribeToTopic() {
        try {
            mqttClient.subscribe("zigbee2mqtt/sensor/#", (topic, message) -> {
                String payload = new String(message.getPayload());
                log.info("📥 MQTT 메시지 수신: {}", payload);

                try {
                    SensorDataRequestDto dto = objectMapper.readValue(payload, SensorDataRequestDto.class);
                    sensorDataService.processSensorData(dto);
                } catch (Exception e) {
                    log.error("❌ 메시지 파싱 오류: {}", e.getMessage());
                }
            });
        } catch (Exception e) {
            log.error("❌ MQTT 구독 실패: {}", e.getMessage());
        }
    }
}

 */
