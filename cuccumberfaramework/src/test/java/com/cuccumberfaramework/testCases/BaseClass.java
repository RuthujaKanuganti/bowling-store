package com.cuccumberfaramework.testCases;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.cuccumberfaramework.utilities.ReadConfig;

public class BaseClass {
ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getusernameL();
	public String password = readconfig.getpassword();
	public static WebDriver driver;
	public static Logger logger;
	@Parameters("browser")
	@BeforeClass
		public void setup(String br) {
			
			logger = Logger.getLogger("cuccumberfaramework");
			PropertyConfigurator.configure("log4j.properties");
			
			if(br.equals("chrome")){
			System.setProperty("webdriver.chrome.driver",readconfig.getchromepath()); //System.getProperty("user.dir") = is the user directory
			driver = new ChromeDriver();
			}
			driver.get(baseURL);
		}
	@AfterClass
	public void teardrop() {
		driver.quit();
		
	}
}
