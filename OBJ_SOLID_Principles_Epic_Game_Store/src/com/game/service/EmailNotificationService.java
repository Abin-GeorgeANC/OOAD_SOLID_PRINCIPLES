package com.game.service;

import com.game.interfaces.NotificationService;

public class EmailNotificationService implements NotificationService {

	@Override
	public void sendNotification(String messsage) {
		System.out.println("Notification message:"+messsage);
		
	}

	

	

}
