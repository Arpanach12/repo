package com.mindtree.regService.service.servicepl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.regService.entity.AccountType;
import com.mindtree.regService.entity.Branch;
import com.mindtree.regService.entity.Registration;
import com.mindtree.regService.repository.AccountTypeRepository;
import com.mindtree.regService.repository.BranchRepository;
import com.mindtree.regService.repository.RegistrationRepository;
import com.mindtree.regService.repository.UserDetailsRepository;
import com.mindtree.regService.service.RegServiceInterface;
@Service
public class RegServiceImpl implements RegServiceInterface {

	@Autowired
	RegistrationRepository registrationRepository;
	
	@Autowired
	AccountTypeRepository accountTypeRepository;
	
	@Autowired
	BranchRepository branchRepository;
	
	@Autowired
	UserDetailsRepository userDetailsRepository;

	public String insertdata(Registration user) throws Exception {
		int count=0;
		List<Registration> userlist=registrationRepository.findAll();
		System.out.println(user);
		if(user==null)
		{
			System.out.println("arpana is cute");

		}
		for(Registration userObj:userlist)
		{
			if(userObj.getUserDetails().getEmailId().equals(user.getUserDetails().getEmailId()))
			{
				System.out.println("arpana is sweet");
				count++;
				System.out.println(count);
			}
		}
		System.out.println(count);
		if(count==0) {
		registrationRepository.save(user);
		return "inserted";
		}
		else {
			return "already registered";
		}
	}

	
	public List<Registration> getuserList() throws Exception {
		List<Registration> userlist=registrationRepository.findAll();
		return userlist;
	}


	
	public String updateUserStatus(int regId) throws Exception {
		Registration regObj=registrationRepository.findById(regId).get();
		AccountType account=regObj.getAccountType();
		account.setAccountType("approved");
		accountTypeRepository.save(account);
		return "updated";
	}


	public String updateUserStatusOnDocUpload(int id) {
		Registration regObj=registrationRepository.findById(id).get();
		AccountType account=regObj.getAccountType();
		account.setAccountType("document uploaded");
		accountTypeRepository.save(account);
		return "updated";
	}


	
	public String createUpdate(int id) {
		Registration regObj=registrationRepository.findById(id).get();
		AccountType account=regObj.getAccountType();
		account.setAccountType("Account created");
		System.out.println("sdfgkddgdh");
		accountTypeRepository.save(account);
		return "updated";
	}


	
	public String rejectUpdate(int id) {
		Registration regObj=registrationRepository.findById(id).get();
		AccountType account=regObj.getAccountType();
		account.setAccountType("rejected");
		System.out.println("dgdh");
		accountTypeRepository.save(account);
		return "updated";
	}

	public String updateDetails(Registration regObj) {
		Branch branch=regObj.getBranch();
		branchRepository.save(branch);
		System.out.println("sh");
		userDetailsRepository.save(regObj.getUserDetails());
		return "account created";
	}


	public String updatbName(Registration regObj) {
		branchRepository.save(regObj.getBranch());
		return "updatedBranchName";
	}
}
