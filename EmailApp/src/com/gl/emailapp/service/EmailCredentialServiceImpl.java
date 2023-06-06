package com.gl.emailapp.service;

import java.util.Random;

import com.gl.emailapp.model.Employee;

public class EmailCredentialServiceImpl implements EmailCredentialService {

	public EmailCredentialServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String generateEmailAddress(Employee emp, String department) {
		// TODO Auto-generated method stub
		return emp.getFirstName().toLowerCase() + emp.getLastName().toLowerCase() + "@" + department + "gl.com";
	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String capitalletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallletters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		
		String values = capitalletters + smallletters + numbers + specialCharacters;
		
		Random random = new Random();
		String password = "";
		for (int i = 0; i < 8; i++) {
			password += values.charAt (random.nextInt(values.length()));
		
		}
		return password;
	}

	@Override
	public void showCredentials(Employee employee, String department) {
		// TODO Auto-generated method stub
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows ");
		System.out.println("Your Password: " + generatePassword());
		System.out.println("Your Email: " + generateEmailAddress(employee, department));
	}

}
