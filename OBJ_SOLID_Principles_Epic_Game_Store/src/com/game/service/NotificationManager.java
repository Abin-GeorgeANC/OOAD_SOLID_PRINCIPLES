package com.game.service;

import com.game.entity.User;
import com.game.interfaces.NotificationService;

public class NotificationManager {
	
	private NotificationService notificationService;

	public NotificationManager(NotificationService notificationService) {
		this.notificationService = notificationService;
	}
	
	public void sendNotificationToUser(User user, String message) {
        String fullMessage = "Hello, " + user.getUsername() + " " + message;
        notificationService.sendNotification(fullMessage);
    }
	

}
