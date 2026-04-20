package com.java.core;

public class TestUserGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    UserGenrator ug = new UserGenrator();
    	String result =	ug.userid("Siddhesh", "joshi", 2010);
    	
        System.out.println("User name:" +result);
	}

}
