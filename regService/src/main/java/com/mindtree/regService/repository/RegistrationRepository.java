package com.mindtree.regService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.regService.entity.Registration;
@Repository

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

}
