package org.avi1606.hospital_managment.repository;

import org.avi1606.hospital_managment.entity.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    Patient findByName(String name);

    List<Patient> findByNameContaining(String name);

    List<Patient> findByBirthDate(LocalDate birthDate);

    @Query("SELECT p FROM Patient p")
    Page<Patient> findAllPatients(Pageable pageable);
}
