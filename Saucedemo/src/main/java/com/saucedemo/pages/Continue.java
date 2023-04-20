package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Continue {
	
	@FindBy(id = "first-name")
	private WebElement enterName;
	
	@FindBy(id = "last-name")
	private WebElement enterLstName;
	
	@FindBy(id = "postal-code")
	private WebElement entercode;
	
	@FindBy(id = "continue")
	private WebElement clickon;
	
	@FindBy(xpath = "//h3[contains(@data-test, 'error')]")
	private WebElement errText;

	public Continue(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterName(String firstname) {
		enterName.sendKeys(firstname);
	}
	public void enterLastName(String lastname) {
		enterLstName.sendKeys(lastname);
	}
	public void enterPstlcode(String postalcode) {
		entercode.sendKeys(postalcode);
	}
	public void clickOnContinue() {
		clickon.click();
		
	}
	public String verfyErr() {
		String message = errText.getText();
		return message;
	}
}
