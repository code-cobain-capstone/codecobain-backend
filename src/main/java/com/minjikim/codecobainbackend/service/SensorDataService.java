package com.minjikim.codecobainbackend.service;
/*
import com.minjikim.codecobainbackend.dto.request.SensorDataRequestDto;
import com.minjikim.codecobainbackend.entity.SensorData;
import com.minjikim.codecobainbackend.repository.SensorDataRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
//import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Profile;

@Profile("sensor")
@Slf4j
@Service
@RequiredArgsConstructor
public class SensorDataService {

    private final SensorDataRepository repository;
    //private final RedisTemplate<String, String> redisTemplate;

    public void processSensorData(SensorDataRequestDto dto) {
        // 1. DB 저장
        SensorData entity = SensorData.builder()
                .deviceId(dto.getDeviceId())
                .type(dto.getType())
                .value(dto.getValue())
                .unit(dto.getUnit())
                .timestamp(dto.getTimestamp())
                .build();

        repository.save(entity);
        log.info("✅ 센서 데이터 DB 저장 완료");

        // 2. Redis 저장
        String redisKey = "sensor:" + dto.getDeviceId() + ":" + dto.getType();
        //redisTemplate.opsForValue().set(redisKey, String.valueOf(dto.getValue()));
        log.info("🧠 Redis 실시간 저장: [{}] -> {}", redisKey, dto.getValue());
    }
}


 */