package com.mindtree.DocVallidationService.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import com.mindtree.DocVallidationService.entity.Registration;
import com.mindtree.DocVallidationService.entity.UserDetails;
import com.mindtree.DocVallidationService.repository.RegistrationRepository;
import com.mindtree.DocVallidationService.repository.UserDetailsRepository;
import com.mindtree.DocVallidationService.service.VallidationServiceInterface;

@Service
public class VallidationServiceImpl implements VallidationServiceInterface {

	@Autowired
  JavaMailSender mail;
	
    @Autowired
	private UserDetailsRepository userDetailsRepository;

    @Autowired
    private RegistrationRepository registrationRepository;
    
	public void sendmail(int userId) throws AddressException, MessagingException {
	UserDetails user=userDetailsRepository.findById(userId).get();
	
	SimpleMailMessage msg=new SimpleMailMessage();
	msg.setFrom("sangitachoudhary731@gmail.com");
	msg.setTo(user.getEmailId());
	msg.setSubject("please upload document");
	msg.setText("Dear Customer,"+"\n your request has been approved kindly upload your documents using below link\n" +"\n<a href='http://localhost:4200/user/register/document;id="+ userId + ">upload docuemnt</a>\n"+
    		   "sincerely,\n"+"\n Arpana Kumari");
	  mail.send(msg);

	}

	
	public void accountCreated(Registration user) {
		SimpleMailMessage msg=new SimpleMailMessage();
		msg.setFrom("sangitachoudhary731@gmail.com");
		msg.setTo(user.getUserDetails().getEmailId());
		msg.setSubject("Account Created");
		msg.setText("Dear"+user.getUserDetails().getFirstName()+ "Account created successfully");
	    mail.send(msg);
      System.out.println("arpana");
		}
      		
	}


