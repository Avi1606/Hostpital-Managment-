package org.avi1606.hospital_managment.security;

import lombok.RequiredArgsConstructor;
import org.avi1606.hospital_managment.dto.LoginRequestDto;
import org.avi1606.hospital_managment.dto.LoginResponseDto;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthenticationManager authenticationManager;

    public LoginResponseDto login(LoginRequestDto loginRequestDto) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequestDto.getUsername(), loginRequestDto.getPassword())
        );

        // TODO: Generate JWT token and return LoginResponseDto
        return new LoginResponseDto();
    }
}
