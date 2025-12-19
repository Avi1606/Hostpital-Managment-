package org.avi1606.hospital_managment.controllers;

import lombok.RequiredArgsConstructor;
import org.avi1606.hospital_managment.dto.LoginRequestDto;
import org.avi1606.hospital_managment.dto.LoginResponseDto;
import org.avi1606.hospital_managment.dto.SignupResponseDto;
import org.avi1606.hospital_managment.security.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginRequestDto loginRequestDto){
        return ResponseEntity.ok(authService.login(loginRequestDto));
    }

    @PostMapping("/signup")
    public ResponseEntity<SignupResponseDto> signup(@RequestBody LoginRequestDto signupRequest){
        return ResponseEntity.ok(authService.signup(signupRequest));
    }




}

