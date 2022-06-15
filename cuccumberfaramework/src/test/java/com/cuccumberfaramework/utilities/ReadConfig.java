package com.cuccumberfaramework.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro; //initialize properties
	
	//create a constructor
	public ReadConfig() {
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);// In order to read the data from a file we use FileInputStream
			pro = new Properties();
			pro.load(fis);//Load is method which loads the properties file
		}catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	public String getusernameL() {
		String username = pro.getProperty("username");
		return username;
	}
	public String getpassword() {
		String password = pro.getProperty("password");
		return password;
	}
	public String getchromepath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
}
