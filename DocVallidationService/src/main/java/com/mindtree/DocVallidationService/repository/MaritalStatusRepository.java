package com.mindtree.DocVallidationService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.DocVallidationService.entity.MaritalStatus;

@Repository

public interface MaritalStatusRepository extends JpaRepository<MaritalStatus, Integer> {

}
