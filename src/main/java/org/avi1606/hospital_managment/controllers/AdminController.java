package org.avi1606.hospital_managment.controllers;

import lombok.RequiredArgsConstructor;
import org.avi1606.hospital_managment.dto.PatientResponseDto;
import org.avi1606.hospital_managment.services.PatientServices;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class AdminController {

    private final PatientServices patientServices;

    @GetMapping("/patients")
    public ResponseEntity<List<PatientResponseDto>> getAllPatients(
            @RequestParam(value = "page", defaultValue = "0")Integer pageNumber,
            @RequestParam(value = "size", defaultValue = "10")Integer pageSize
            )
    {
        return ResponseEntity.ok(patientServices.getAllPatients(pageNumber, pageSize));
    }


}
