package com.saucedemo.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTestClass {
	
WebDriver driver;
	
	@BeforeClass
	public void launchApp() {
		
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
		
	}
}
