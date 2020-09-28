package com.mindtree.regService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.regService.entity.UserDocuments;
@Repository
public interface UserDocumentsRepository extends JpaRepository<UserDocuments, Integer> {

}
