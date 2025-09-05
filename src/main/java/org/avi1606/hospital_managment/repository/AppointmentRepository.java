package org.avi1606.hospital_managment.repository;

import org.avi1606.hospital_managment.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}