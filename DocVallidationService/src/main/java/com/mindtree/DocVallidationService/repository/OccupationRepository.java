package com.mindtree.DocVallidationService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.DocVallidationService.entity.Occupation;

@Repository

public interface OccupationRepository extends JpaRepository<Occupation, Integer> {

}
