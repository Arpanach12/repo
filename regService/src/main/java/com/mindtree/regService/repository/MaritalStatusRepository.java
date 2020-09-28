package com.mindtree.regService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.regService.entity.MaritalStatus;
@Repository

public interface MaritalStatusRepository extends JpaRepository<MaritalStatus, Integer> {

}
