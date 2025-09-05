package org.avi1606.hospital_managment.repository;

import org.avi1606.hospital_managment.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}