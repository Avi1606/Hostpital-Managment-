package org.avi1606.hospital_managment.repository;

import org.avi1606.hospital_managment.entity.Deparatment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface DepartmentRepository extends JpaRepository<Deparatment, Long> {
}