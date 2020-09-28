package com.mindtree.DocVallidationService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.DocVallidationService.entity.UserDetails;

@Repository

public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {

}
