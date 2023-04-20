package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifySccsMsg {
	
	@FindBy(xpath = "//div[contains(@class,'complete-text')]")
	private WebElement verifyMsg;
	
	@FindBy(xpath = "//h2[contains(@class, 'complete-header')]")
	private WebElement verfyMsg;

	public VerifySccsMsg(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String getVerifyMsg() { 
		String message = verifyMsg.getText();
		return message;
	}
	public String thankYouMsg() {
		String message = verfyMsg.getText();
		return message;
	}
}
