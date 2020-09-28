package com.mindtree.DocVallidationService.service;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.stereotype.Service;

import com.mindtree.DocVallidationService.entity.Registration;

@Service
public interface VallidationServiceInterface {

	void sendmail(int userId) throws AddressException, MessagingException;

	void accountCreated(Registration user);

}
