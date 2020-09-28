package com.mindtree.regService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.regService.entity.UserDocuments;
import com.mindtree.regService.service.DocumentInterface;

@RestController
@CrossOrigin
public class DocumentController {

	@Autowired
	DocumentInterface documentInterface;
	
	@PostMapping("/updateUserDocuments")
	public ResponseEntity<String> updateStatus(@RequestBody List<UserDocuments> documentList)
	{
		try {
			documentInterface.saveDocumentData(documentList);
			return new ResponseEntity<String>("successfully saved", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Error occured while clearing data registration table",
					HttpStatus.BAD_REQUEST);
		}	
		
	}
	@GetMapping("/getalldocuments")
	public ResponseEntity<?> getdocuments()
	{
		try {
			
			return new ResponseEntity<List<UserDocuments>>(documentInterface.getDocumentDetails(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Error occured while clearing data registration table",
					HttpStatus.BAD_REQUEST);
		}	
	}
}
