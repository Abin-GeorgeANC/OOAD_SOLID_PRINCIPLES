package com.game.utility;

import java.util.Scanner;

import com.game.entity.PremiumUser;
import com.game.entity.User;
import com.game.interfaces.NotificationService;
import com.game.service.EmailNotificationService;
import com.game.service.NotificationManager;
import com.game.service.RegularAccountService;
public class EpicGameStore {

	
	public static void main(String[] args) {
		char choice= 'y';
		Scanner scanner = new Scanner(System.in);
		User user= null;
		PremiumUser premiumUser= null;
		RegularAccountService accountManager = new RegularAccountService();
		EmailNotificationService emailNotification = new EmailNotificationService();
		NotificationManager notificationManager = new NotificationManager(emailNotification);
		

		System.out.println("**************Epic GameStore****************");
		do {
			System.out.println("1.Create Account\n2.Login\n3.Logout\n4.Show User");
			int userChoice= scanner.nextInt();
			switch (userChoice) {
			case 1:user= accountManager.registerUser();
					notificationManager.sendNotificationToUser(user,"Welcome to Epic Games Store");
					break;
			case 2: accountManager.loginUser();
					break;
			case 3:accountManager.logoutUser(user);
				    break;
			case 4:accountManager.showUser(user);
				   break;
			default:
				System.out.println("Invalid");
			}
			System.out.println("Continue(y/n)?");
			choice= scanner.next().charAt(0);
		}while(choice!='n');
    

	}

}
