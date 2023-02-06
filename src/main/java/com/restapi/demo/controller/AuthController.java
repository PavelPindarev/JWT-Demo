package com.restapi.demo.controller;

import com.restapi.demo.model.dto.AuthenticationRequest;
import com.restapi.demo.model.dto.AuthenticationResponse;
import com.restapi.demo.model.dto.RegisterRequest;
import com.restapi.demo.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(

            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(authService.login(request));
    }
}
