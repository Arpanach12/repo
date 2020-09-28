package com.mindtree.regService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.regService.entity.Registration;

@Service
public interface RegServiceInterface {

	String insertdata(Registration user) throws Exception;

	List<Registration> getuserList() throws Exception;

	String updateUserStatus(int regId) throws Exception;

	String updateUserStatusOnDocUpload(int id);

	String createUpdate(int id);

	String rejectUpdate(int id);

	String updateDetails(Registration regObj);

	String updatbName(Registration regObj);

}
