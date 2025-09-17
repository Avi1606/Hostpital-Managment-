package org.avi1606.hospital_managment.services_Testing;

import org.avi1606.hospital_managment.entity.Appointment;
import org.avi1606.hospital_managment.services.AppointmentServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AppointmentService {

    @Autowired
    private AppointmentServices appointmentServices;

    @Test
    public void createAppointment() {
        Appointment appointment = Appointment.builder()
                .description("cancer")
                .status("waiting")
                .build();

        var appointment1 =  appointmentServices.createNewAppointment(appointment , 1L ,1L);

        System.out.println( appointment1);

        Appointment appointment2 = appointmentServices.reAssignAppointment(appointment1.getId(), 2L);

        System.out.println( appointment2);
    }
}
