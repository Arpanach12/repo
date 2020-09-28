package com.mindtree.regService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.regService.entity.Income;
@Repository

public interface IncomeRepository extends JpaRepository<Income, Integer> {

}
