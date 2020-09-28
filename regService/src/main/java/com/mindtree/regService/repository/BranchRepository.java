package com.mindtree.regService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.regService.entity.Branch;
@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer> {

}
