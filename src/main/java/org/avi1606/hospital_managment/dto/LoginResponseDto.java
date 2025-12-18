package org.avi1606.hospital_managment.dto;

import lombok.Data;

@Data
public class LoginResponseDto {

    String jwt;
    Long userId;

}
