package com.mindtree.DocVallidationService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.DocVallidationService.entity.Registration;

@Repository

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

}
