package com.java.core;

public class UserGenrator {
	public String userid(String fname, String lname, int yob)
	{
		
		 int year = yob % 100;
		String username = fname + lname + year;
		return username;
	}
}
