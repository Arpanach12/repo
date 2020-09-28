package com.mindtree.regService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.regService.entity.UserDetails;
@Repository

public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {

}
