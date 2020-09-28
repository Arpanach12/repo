package com.mindtree.DocVallidationService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.DocVallidationService.entity.ResidentialStatus;

@Repository
public interface ResidentialStatusRepository extends JpaRepository<ResidentialStatus, Integer> {

}
