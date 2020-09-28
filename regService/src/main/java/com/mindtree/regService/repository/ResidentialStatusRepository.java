package com.mindtree.regService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.regService.entity.ResidentialStatus;
@Repository
public interface ResidentialStatusRepository extends JpaRepository<ResidentialStatus, Integer> {

}
