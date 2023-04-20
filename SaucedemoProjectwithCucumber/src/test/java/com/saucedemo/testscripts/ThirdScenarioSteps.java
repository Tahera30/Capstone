package com.saucedemo.testscripts;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ThirdScenarioSteps extends Driver{
	
	
	@Given("Go to your Landing Page")
	public void go_to_your_landing_page() {
		
	}

	@When("Enter the username problem_user")
	public void enter_the_username_problem_user() {
	
	    landingPage.enterUserName("problem_user");
	}

	@When("Enter your password secret_sauce")
	public void enter_your_password_secret_sauce() {
	   landingPage.enterPassword("secret_sauce");
	}

	@When("click on the Login button")
	public void click_on_the_login_button() {
	    landingPage.clickLognBtn();
	}

	@When("Add the first item to the cart")
	public void add_the_first_item_to_the_cart() {
		
		    buyProducts.addFrstP();
	}

	@When("Click on cart icon at top right corner")
	public void click_on_cart_icon_at_top_right_corner() {
		
		buyProducts.cornerBtn();
	}

	@When("Click on the Checkout button")
	public void click_on_the_checkout_button() {
	    checkout.clickcheck();
	}

	@When("Enter the first name in First Name textbox")
	public void enter_the_first_name_in_first_name_textbox() {
	  
	    info.enterName("Tahera");
	}

	@When("Enter the last name in the last Name textbox")
	public void enter_the_last_name_in_the_last_name_textbox() {
		info.enterLastName("Atbin");
	    
	}

	@When("Enter Postal Code in the Postal Code textbox")
	public void enter_postal_code_in_the_postal_code_textbox() {
	   info.enterPstlcode("20910");
	}

	@When("Click on the Continue button")
	public void click_on_the_continue_button() {
	    info.clickOnContinue();
	
	}

	@When("Verify the Error: Last Name is required")
	public void verify_the_error_last_name_is_required() {
	    String expectedErr = "Error: Last Name is required";
	    String actualErr = info.verfyErr();
	    Assert.assertEquals(actualErr, expectedErr);
	}
	@Then("Close browser")
	public void close_browser() {
	  
	}
}
