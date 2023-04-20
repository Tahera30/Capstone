package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	
	@FindBy(id = "checkout")
	private WebElement checkoutBtn;
	
	@FindBy(xpath = "//span[contains(@class, 'title')]")
	private WebElement verfyCart;
	
	@FindBy(id = "continue-shopping")
	private WebElement continueShopng;
	
	public Checkout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickcheck() {
		checkoutBtn.click();
	}
	public String VerifyCartMsg() {
	String message = verfyCart.getText();
	return message;
	}
	public void shopping() {
		continueShopng.click();
	
	}
}
