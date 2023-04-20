package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyProducts {

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement frstproduct;

	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement secndproduct;

	@FindBy(xpath = "//a[contains(@class, 'shopping_cart_link')]")
	private WebElement clickcart;
	
	@FindBy(xpath = "//select[contains(@class,'product_sort_container')]")
	private WebElement sortByPrice;
	
	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	private WebElement addThrdP;
	@FindBy(id = "remove-sauce-labs-backpack")
	private WebElement removeFrst;
	@FindBy(xpath = "//select[contains(@class, 'product_sort_container')]")
	private WebElement sortHighPrice;
	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	private WebElement addExpnsive;
	
	public BuyProducts(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void addFrstP() {
		frstproduct.click();
		
	}
	public void addScndP() {
		secndproduct.click();
	}
	public void cornerBtn() {
		clickcart.click();
	}
	public void sortPrice(String sort) {
		sortByPrice.sendKeys(sort);
	}
	public void buyThirdP() {
		addThrdP.click();
		
	}
	public void removep() {
		removeFrst.click();
	}
	public void sortPHighToLow(String sort) {
		sortHighPrice.sendKeys(sort);
	}
	public void addTheExpnsive() {
		addExpnsive.click();
	}
}
