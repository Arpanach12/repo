package com.mindtree.regService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.regService.entity.Document;
@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer> {

}
