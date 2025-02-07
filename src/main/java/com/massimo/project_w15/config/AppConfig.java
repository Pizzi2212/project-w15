package com.massimo.project_w15.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import services.PrenotazioneService;

@Configuration
public class AppConfig {

    @Bean
    public PrenotazioneService prenotazioneValidationService() {
        return new PrenotazioneService();
    }
}
