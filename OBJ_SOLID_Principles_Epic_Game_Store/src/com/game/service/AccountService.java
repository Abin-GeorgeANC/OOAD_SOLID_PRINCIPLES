package com.game.service;

import com.game.entity.PremiumUser;
import com.game.entity.User;

public  class AccountService {
	public void logoutUser(User user) {
		
		System.out.println(user.getUsername()+" has been loged out");
	
	}
	public void showUser(User user) {
		System.out.println("User: "+user.getUsername());
		if (user instanceof PremiumUser) {
			System.out.println("**Premium User**");
		}
	}
}
