package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	@FindBy(id = "user-name")
	private WebElement userText;
	
	@FindBy(id = "password")
	private WebElement passwordText;
	
	@FindBy(id = "login-button")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//h3[contains(@data-test, 'error')]")
	private WebElement errMsg;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String user) {
		userText.sendKeys(user);
		
	}
	public void enterPassword(String password) {
		passwordText.sendKeys(password);
	}
	public void clickLognBtn() {
		loginBtn.click();
	}
	public String getErrMsg() {
		String message = errMsg.getText();
		return message;
	}
	
}


