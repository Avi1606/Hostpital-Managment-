package org.avi1606.hospital_managment.controllers;

import lombok.RequiredArgsConstructor;
import org.avi1606.hospital_managment.dto.DoctorResponseDto;
import org.avi1606.hospital_managment.services.DoctorService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HospitalController {

    private final DoctorService doctorServices;

    @GetMapping("/")
    public ResponseEntity<List<DoctorResponseDto>> getAllDoctors() {
        return ResponseEntity.ok(doctorServices.getAllDoctors());
    }
}
