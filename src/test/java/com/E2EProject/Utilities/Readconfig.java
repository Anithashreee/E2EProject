package com.E2EProject.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
	Properties pro;  //we need to create one object for properties class
	
	public Readconfig() //creating a constructor
	{
	File src=new File("./configuration/config.properties");
	
	try{
		FileInputStream fis = new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
	}catch (Exception e)
	{
		System.out.println("Exception is:"+e.getMessage());
	}
	}
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getUsername()
	
	{
		String username=pro.getProperty("Username");
		return username;
	}
	public String getPassword()
	{
		String password=pro.getProperty("Password");
		return password;
	}
	public String getChromePath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
}