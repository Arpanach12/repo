package com.mindtree.regService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.regService.entity.Education;
@Repository

public interface EducationRepository extends JpaRepository<Education, Integer> {

}
