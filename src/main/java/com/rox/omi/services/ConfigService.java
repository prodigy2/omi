package com.rox.omi.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConfigService {

    @Value("${ollama.url}")
    private String ollamaUrl;

    public String getOllamaUrl() {
        return ollamaUrl;
    }
}
