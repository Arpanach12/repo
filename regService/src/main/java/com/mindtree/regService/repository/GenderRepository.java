package com.mindtree.regService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.regService.entity.Gender;
@Repository

public interface GenderRepository extends JpaRepository<Gender, Integer> {

}
