package org.avi1606.hospital_managment.repository;

import org.avi1606.hospital_managment.entity.User;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface UserRepository extends Repository<User, Long> {

    Optional<User> findByUsername(String username);

}
