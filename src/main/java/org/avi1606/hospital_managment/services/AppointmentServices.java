package org.avi1606.hospital_managment.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.avi1606.hospital_managment.entity.Appointment;
import org.avi1606.hospital_managment.entity.Doctor;
import org.avi1606.hospital_managment.entity.Patient;
import org.avi1606.hospital_managment.repository.AppointmentRepository;
import org.avi1606.hospital_managment.repository.DoctorRepository;
import org.avi1606.hospital_managment.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentServices {

    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;
    private final AppointmentRepository appointmentRepository;

    @Transactional
    public Appointment createNewAppointment(Appointment appointment, Long doctorId, Long patientId) {
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow(() -> new IllegalArgumentException("Doctor not found"));
        Patient patient = patientRepository.findById(patientId).orElseThrow(() -> new IllegalArgumentException("Patient not found"));

        if(appointment.getId() != null) throw new IllegalArgumentException("Appointment already exists");
        appointment.setDoctor(doctor);
        appointment.setPatient(patient);

        appointmentRepository.save(appointment);

        patient.getAppointment().add(appointment);  //bi-directional relationship
        return appointmentRepository.save(appointment);
    }

    @Transactional
    public Appointment reAssignAppointment(Long appointmentId ,Long doctorId){
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow(() ->new IllegalArgumentException("Doctor not found"));
        Appointment appointment = appointmentRepository.findById(appointmentId).orElseThrow(() ->new IllegalArgumentException("Appointment not found"));

        appointment.setDoctor(doctor); // this time it will be update call because we made doctor dirty

        doctor.getAppointment().add(appointment);

        return appointmentRepository.save(appointment);
    }
}
