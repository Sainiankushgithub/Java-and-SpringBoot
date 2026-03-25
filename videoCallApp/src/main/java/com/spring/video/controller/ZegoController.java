package com.spring.video.controller;

import com.spring.video.service.ZegoTokenService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zego")
@CrossOrigin(origins = "*")
public class ZegoController {

    private final ZegoTokenService tokenService;

    public ZegoController(ZegoTokenService tokenService) {
        this.tokenService = tokenService;
    }

    @GetMapping("/token")
    public String getToken(
            @RequestParam String userId,
            @RequestParam String roomId) {

        return tokenService.generateToken(userId, roomId);
    }
}