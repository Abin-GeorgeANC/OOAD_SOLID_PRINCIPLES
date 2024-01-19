package com.game.entity;

public class PremiumUser extends User{

	private boolean isPremium;

	public PremiumUser(String username, String email, String password, boolean isPremium) {
		super(username, email, password);
		this.isPremium = isPremium;
	}

	public boolean isPremium() {
		return isPremium;
	}

	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}
	
}
