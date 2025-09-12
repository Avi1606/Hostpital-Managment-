package org.avi1606.hospital_managment.services;


import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.avi1606.hospital_managment.entity.Insurance;
import org.avi1606.hospital_managment.entity.Patient;
import org.avi1606.hospital_managment.repository.InsuranceRepository;
import org.avi1606.hospital_managment.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsuranceService {

    private final InsuranceRepository insuranceRepository;
    private final PatientRepository patientRepository;

    @Transactional
    public Patient assignInsuranceToPatient(Insurance insurance, Long patientId) {
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new EntityNotFoundException("Patient not found !"));

        patient.setInsurance(insurance);

        insurance.setPatient(patient);  // for double sided relationship

        return patient;
    }

}
