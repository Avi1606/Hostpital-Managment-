package org.avi1606.hospital_managment.patient;

import org.avi1606.hospital_managment.entity.Patient;
import org.avi1606.hospital_managment.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
public class patient_Test {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void patient_name_test() {
        Patient patient = patientRepository.findByName("Sneha Patel");

        System.out.println( patient);

    }

    @Test
    public void patient_find_test() {
        List<Patient> patient = patientRepository.findByBirthDate(LocalDate.of(1992, 1, 18));

        for (Patient p : patient) {
            System.out.println(p);
        }
    }

    @Test
    public void patient_find_test2() {
        List<Patient> patients = patientRepository.findByNameContaining("Sne");
    }
}
