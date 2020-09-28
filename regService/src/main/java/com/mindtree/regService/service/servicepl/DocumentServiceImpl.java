package com.mindtree.regService.service.servicepl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.regService.entity.UserDocuments;
import com.mindtree.regService.repository.UserDocumentsRepository;
import com.mindtree.regService.service.DocumentInterface;
@Service
public class DocumentServiceImpl implements DocumentInterface {
 
	@Autowired
	UserDocumentsRepository userDocumentsRepository;

	
	public void saveDocumentData(List<UserDocuments> documentList) {
		for(UserDocuments doc:documentList)
		{
			userDocumentsRepository.save(doc);
		}
		
	}


	public List<UserDocuments> getDocumentDetails() {
		
		return userDocumentsRepository.findAll();
	}
}
