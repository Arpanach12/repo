package com.mindtree.DocVallidationService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.DocVallidationService.entity.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer> {

}
