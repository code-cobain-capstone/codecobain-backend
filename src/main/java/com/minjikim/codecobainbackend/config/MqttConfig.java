package com.minjikim.codecobainbackend.config;
/*
import com.minjikim.codecobainbackend.util.AwsIotSslUtil;
import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("sensor")
@Configuration
public class MqttConfig {

    @Value("${mqtt.endpoint}")
    private String endpoint;

    @Value("${mqtt.client-id}")
    private String clientId;

    @Value("${mqtt.cert.ca}")
    private String caPath;

    @Value("${mqtt.cert.crt}")
    private String crtPath;

    @Value("${mqtt.cert.key}")
    private String keyPath;

    @Bean
    public MqttClient mqttClient() throws Exception {
        String brokerUrl = "ssl://" + endpoint + ":8883";
        MqttClient client = new MqttClient(brokerUrl, clientId, new MemoryPersistence());

        MqttConnectOptions options = new MqttConnectOptions();
        options.setCleanSession(true);
        options.setSocketFactory(
                AwsIotSslUtil.getSocketFactory(caPath, crtPath, keyPath)
        );

        client.connect(options);
        return client;
    }
}



 */