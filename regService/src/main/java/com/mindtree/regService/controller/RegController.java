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

import com.mindtree.regService.entity.Registration;
import com.mindtree.regService.service.RegServiceInterface;

@RestController
@CrossOrigin
public class RegController {

	@Autowired
	RegServiceInterface regServiceInterface;
	
	@PostMapping("registeruser")
	private ResponseEntity<?> insertuserDetails(@RequestBody Registration user) {
		System.out.println(user);
		System.out.println("arpana");
		try {
			return new ResponseEntity<String>(regServiceInterface.insertdata(user), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Error occured while clearing data registration table",
					HttpStatus.BAD_REQUEST);
		}
		
	}
	@GetMapping("getuserdetails")
	private ResponseEntity<?>  getuserdetails(){
		 
		try {
		return new ResponseEntity<List<Registration>>(regServiceInterface.getuserList(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Error occured while clearing data registration table",
					HttpStatus.BAD_REQUEST);
		}
		
	}
	@GetMapping("/updateAccountStatus/{id}")
	public ResponseEntity<String> updateStatus(@PathVariable int id)
	{
		System.out.println(id);
		try {
			return new ResponseEntity<String>(regServiceInterface.updateUserStatus(id), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Error occured while clearing data registration table",
					HttpStatus.BAD_REQUEST);
		}	
		
	}
	@GetMapping("/updateStatus/{id}")
	public ResponseEntity<String> updateStatusOnDocUpload(@PathVariable int id)
	{
		System.out.println(id);
		try {
			return new ResponseEntity<String>(regServiceInterface.updateUserStatusOnDocUpload(id), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Error occured while clearing data registration table",
					HttpStatus.BAD_REQUEST);
		}	
		
	}
	@GetMapping("/update/{id}")
	public ResponseEntity<String> createUpdate(@PathVariable int id)
	{
		System.out.println("sabhelh");
		try {
			return new ResponseEntity<String>(regServiceInterface.createUpdate(id), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Error occured while clearing data registration table",
					HttpStatus.BAD_REQUEST);
		}	
		
	}
	@GetMapping("/rejectUpdate/{id}")
	public ResponseEntity<String> rejectUpdate(@PathVariable int id)
	{
		System.out.println("sdfghjkddgdh");
		try {
			return new ResponseEntity<String>(regServiceInterface.rejectUpdate(id), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Error occured while clearing data registration table",
					HttpStatus.BAD_REQUEST);
		}	
		
	}
	@PostMapping("updateAccountData")
	public ResponseEntity<String> updateDetails(@RequestBody Registration regObj)
	{
		System.out.println("ddgdh");
		try {
			return new ResponseEntity<String>(regServiceInterface.updateDetails(regObj), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Error occured while clearing data registration table",
					HttpStatus.BAD_REQUEST);
		}	
		
	}
	@PostMapping("updateBranchName")
	public ResponseEntity<String> updatbName(@RequestBody Registration regObj)
	{
		System.out.println("ddgdh");
		try {
			return new ResponseEntity<String>(regServiceInterface.updatbName(regObj), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Error occured while clearing data registration table",
					HttpStatus.BAD_REQUEST);
		}	
		
	}
	
}
