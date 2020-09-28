package com.mindtree.regService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.regService.entity.Occupation;
@Repository

public interface OccupationRepository extends JpaRepository<Occupation, Integer> {

}
