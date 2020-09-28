package com.mindtree.DocVallidationService.controller;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.DocVallidationService.entity.Registration;
import com.mindtree.DocVallidationService.service.VallidationServiceInterface;

@RestController
@CrossOrigin
public class VallidationController {

	@Autowired
	VallidationServiceInterface vallidationServiceInterface;
	
	@GetMapping("/sendmailtouser/{userId}")
	public  ResponseEntity<?> sendemailtoUser(@PathVariable int userId) {
		try {
			vallidationServiceInterface.sendmail(userId);
		}  catch (Exception e) {
			return new ResponseEntity<String>("Error in sending email", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>("Email sent successfully", HttpStatus.OK);
		
	}
	@PostMapping("sendAccountMail")
	public ResponseEntity<?> sendAccountCreatedEmail(@RequestBody Registration user) {
		System.out.println("ardhdg");
		try {
			vallidationServiceInterface.accountCreated(user);
		} catch (Exception e) {
			return new ResponseEntity<String>("Error in sending email", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>("Email sent successfully", HttpStatus.OK);
	}
}
