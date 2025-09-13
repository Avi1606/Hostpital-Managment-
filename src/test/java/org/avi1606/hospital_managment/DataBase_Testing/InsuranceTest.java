package org.avi1606.hospital_managment.DataBase_Testing;

import org.avi1606.hospital_managment.entity.Insurance;
import org.avi1606.hospital_managment.entity.Patient;
import org.avi1606.hospital_managment.services.InsuranceService;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InsuranceTest {

    @Autowired
    private InsuranceService insuranceService;

    @Test
    public void test() {
        Insurance insurance = Insurance.builder()
                .policyNumber("123456789")
                .provider("XYZ")
                .validUntil("2021-01-01")
                .build();

        Patient patient = insuranceService.assignInsuranceToPatient(insurance, 1L);
        System.out.println(patient);
    }
}
