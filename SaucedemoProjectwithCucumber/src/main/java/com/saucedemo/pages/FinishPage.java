package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishPage {
	@FindBy(id = "finish")
	private WebElement finishbtn;
	
	public FinishPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClickonFinish() {
		finishbtn.click();
	}

}
