package com.spring.video.service;

import org.springframework.stereotype.Service;

@Service
public class ZegoTokenService {

    public String generateToken(String userId, String roomId) {
        // Not used for now (we'll use frontend test token)
        return "TEMP_TOKEN";
    }
}