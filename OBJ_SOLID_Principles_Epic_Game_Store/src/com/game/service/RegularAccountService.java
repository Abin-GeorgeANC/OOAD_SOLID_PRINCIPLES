package com.game.service;

import java.util.Scanner;

import com.game.entity.User;
import com.game.interfaces.LoginUser;
import com.game.interfaces.PhoneOtp;
import com.game.interfaces.RegisterUser;

public class RegularAccountService extends AccountService  implements RegisterUser,LoginUser,PhoneOtp{

	@Override
	public User registerUser() {
		String username=null;
		String email=null;
		String password=null;
		String Otp=null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter User Name");
		username=scanner.next();
		System.out.println("Enter Email");
		email= scanner.next();
		System.out.println("Enter Password");
		password =scanner.next();
		phoneOtp();
		System.out.println("Enter OTP");
		Otp=scanner.next();
		User user = new User(username,email,password);
		System.out.println("Account Created..");
		return user;
		}

	@Override
	public void loginUser() {
		String username=null;
		String password=null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter User Name");
		username=scanner.next();	
		System.out.println("Enter Password");
		password= scanner.next();
		System.out.println("Login Completed\n"+username+" loged in");
	}

	@Override
	public void phoneOtp() {
		int randomNumber= (int) Math.floor(Math.random()*1000);
		System.out.println("Your OTP is "+randomNumber);
		
	}
	
	
}
