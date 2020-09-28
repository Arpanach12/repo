package com.mindtree.DocVallidationService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.DocVallidationService.entity.Income;

@Repository

public interface IncomeRepository extends JpaRepository<Income, Integer> {

}
