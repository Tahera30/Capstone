package com.saucedemo.testscripts;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SecondScenarioSteps extends Driver{
	
	
	@Given("Go to the Landing Page")
	public void go_to_the_landing_page() {
		
	}

	@When("Enter the username locked_out_user")
	public void enter_the_username_locked_out_user() {
		
	    landingPage.enterUserName("locked_out_user");
	}

	@When("Enter password the secret_sauce")
	public void enter_password_the_secret_sauce() {
	    landingPage.enterPassword("secret_sauce");
	    
	}

	@When("click on to login button")
	public void click_on_to_login_button() {
	    landingPage.clickLognBtn();
	}

	@When("Verify the err message Epic sadface: Sorry this user has been locked out")
	public void verify_the_success_message_epic_sadface_sorry_this_user_has_been_locked_out() {
	    landingPage.getErrMsg();
	}

	@Then("Close your browser")
	public void close_your_browser() {
	
	}

}
