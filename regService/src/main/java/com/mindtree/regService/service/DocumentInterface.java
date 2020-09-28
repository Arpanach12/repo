package com.mindtree.regService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.regService.entity.UserDocuments;

@Service
public interface DocumentInterface {

	void saveDocumentData(List<UserDocuments> documentList);

	List<UserDocuments> getDocumentDetails();

}
