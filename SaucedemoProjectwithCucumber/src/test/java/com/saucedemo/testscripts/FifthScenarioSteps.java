package com.saucedemo.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FifthScenarioSteps extends Driver{
	
	
	@Given("Go to into the landing Page")
	public void go_to_into_the_landing_page() {
		
	}

	@When("Enter the username")
	public void enter_the_username() {
	 
	   landingPage.enterUserName("standard_user");
	}

	@When("enter the password")
	public void enter_the_password() {
	    landingPage.enterPassword("secret_sauce");
	}

	@When("click to the login")
	public void click_to_the_login() {
	    landingPage.clickLognBtn();
	}

	@When("add the first and third items to the cart")
	public void add_the_first_and_third_items_to_the_cart() {
	   buyProducts.addFrstP();
	   buyProducts.addScndP();
	}

	@When("remove the first item from the cart")
	public void remove_the_first_item_from_the_cart() {
		buyProducts.removep();
	}

	@When("click on the top right corner cart button")
	public void click_on_the_top_right_corner_cart_button() {
		
		buyProducts.cornerBtn();
	}
	@When("Now verify that there are two items in the cart")
	public void now_verify_that_there_are_two_items_in_the_cart() {
		WebElement itemCountElement = driver.findElement(By.xpath("//a[contains(@class,'shopping_cart_link')]"));
		String itemCountText = itemCountElement.getText();
		int itemCount = Integer.parseInt(itemCountText);
		if (itemCount == 2) {
			System.out.println("Cart contains two items");
		}
		else {
			System.out.println("wrong number of items in cart:" +itemCount);
		}
	}

	@When("verify the text Your Cart at the left side of the page")
	public void verify_the_text_your_cart_at_the_left_side_of_the_page() {
	   
	    String expectedCartMsg = "Your Cart";
	    String actualCartMsg = checkout.VerifyCartMsg();
	    Assert.assertEquals(actualCartMsg, expectedCartMsg);
	}

	@When("hit the continue shopping back")
	public void hit_the_continue_shopping_back() {
		
		checkout.shopping();
	}

	@When("sort the price from high to low")
	public void sort_the_price_from_high_to_low() {
	    
	    buyProducts.sortPHighToLow("Price (high to low)");
	}

	@When("add the most expensive item to the cart")
	public void add_the_most_expensive_item_to_the_cart() {
		
		buyProducts.addTheExpnsive();
	}

	@When("again click on the cart icon")
	public void again_click_on_the_cart_icon() {
		
		buyProducts.cornerBtn();
	    
	}

	@When("hit the checkout button")
	public void hit_the_checkout_button() {
	   
	    checkout.clickcheck();
	}

	@When("write your first name")
	public void write_your_first_name() {
		
		info.enterName("Tahera");
	}

	@When("write your last name")
	public void write_your_last_name() {
	    info.enterLastName("Atbin");
	}

	@When("write your postal code")
	public void write_your_postal_code() {
	    info.enterPstlcode("20910");
	}

	@When("hit on the continue button")
	public void hit_on_the_continue_button() {
	    info.clickOnContinue();
	}

	@When("click on the finish button")
	public void click_on_the_finish_button() {
	   
	    finish.ClickonFinish();
	}

	@When("verify the message Thank you for your order!")
	public void verify_the_message_thank_you_for_your_order() {
	   
	    String expectedMsg = "Thank you for your order!";
	    String actualMsg = succesMsg.thankYouMsg();
	    Assert.assertEquals(actualMsg, expectedMsg);
	    
	}

	@Then("close your browser now")
	public void close_your_browser_now() {
	   
	}

}
