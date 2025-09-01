package org.avi1606.hospital_managment.hospital;

import org.avi1606.hospital_managment.entity.Patient;
import org.avi1606.hospital_managment.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class Patient_List_Testing {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void patient_list_test() {

        List<Patient> patientList = patientRepository.findAll();
        System.out.println( patientList);

    }
}
