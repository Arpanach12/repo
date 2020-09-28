package com.mindtree.DocVallidationService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.DocVallidationService.entity.UserDocuments;

@Repository
public interface UserDocumentsRepository extends JpaRepository<UserDocuments, Integer> {

}
