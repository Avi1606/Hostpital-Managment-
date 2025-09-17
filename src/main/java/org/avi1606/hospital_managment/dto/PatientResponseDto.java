package org.avi1606.hospital_managment.dto;

import lombok.Data;
import org.avi1606.hospital_managment.entity.type.BloodGroupType;

import java.time.LocalDate;

@Data
public class PatientResponseDto {
    private Long id;
    private String name;
    private String gender;
    private LocalDate birthDate;
    private BloodGroupType bloodGroup;
}