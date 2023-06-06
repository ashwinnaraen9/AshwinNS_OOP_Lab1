package com.gl.emailapp.main;

import java.util.Scanner;

import com.gl.emailapp.model.Employee;
import com.gl.emailapp.service.EmailCredentialService;
import com.gl.emailapp.service.EmailCredentialServiceImpl;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailCredentialService service = new EmailCredentialServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First Name");
		String fn = sc.next();
		System.out.println("Enter Last Last Name");
		String ln = sc.next();
		
		Employee employee = new Employee(fn, ln);
		
		System.out.println("Please Enter the Department!");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		String department = "";
		int choice = sc.nextInt();
		
		switch (choice){
		case 1:
			department = "tech";
			break;
				
		case 2:
			department = "admin";
			break;
			
		case 3:
			department = "hr";
			break;
			
		case 4:
			department = "legal";
			break;
			
		default:
			System.out.println("Please Select the valid option");
			break;	
				
		}
		
		String generatedPassword = service.generatePassword();
		String generatedEmail = service.generateEmailAddress(employee, department);
		service.showCredentials(employee, department);
		sc.close();

	}

}
