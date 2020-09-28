package com.mindtree.regService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.regService.entity.AccountType;
@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType, Integer> {

}
