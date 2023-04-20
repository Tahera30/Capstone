package com.saucedemo.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.saucedemo.pages.BuyProducts;
import com.saucedemo.pages.Checkout;
import com.saucedemo.pages.Continue;
import com.saucedemo.pages.FinishPage;
import com.saucedemo.pages.LandingPage;
import com.saucedemo.pages.VerifySccsMsg;

public class Driver extends Tools{
	
	protected static LandingPage landingPage;
	protected static BuyProducts buyProducts;
	protected static Continue info;
	protected static FinishPage finish;
	protected static Checkout checkout;
	protected static VerifySccsMsg succesMsg;
	
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		landingPage = new LandingPage(driver);
		buyProducts = new BuyProducts(driver);
		info = new Continue(driver);
		finish = new FinishPage(driver);
		checkout = new Checkout(driver);
		succesMsg = new VerifySccsMsg(driver);
	}

}
