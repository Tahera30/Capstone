package com.saucedemo.testscripts;


import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstScenarioSteps extends Driver{
	
	
	
	@Given("Go to Landing Page")
	public void go_to_landing_page() {
		
	}

	@When("Enter the username standard_user")
	public void enter_the_username_standard_user() {
		
	    landingPage.enterUserName("standard_user");
	}

	@When("Enter the password secret_sauce")
	public void enter_the_password_secret_sauce() {
	    landingPage.enterPassword("secret_sauce");
	}

	@When("click on Login button")
	public void click_on_login_button() {
	    landingPage.clickLognBtn();
	}

	@When("Add the first two items to the cart")
	public void add_the_first_two_items_to_the_cart() {
	  
	    buyProducts.addFrstP();
	    buyProducts.addScndP();
	}

	@When("Click on the cart icon at top right corner")
	public void click_on_the_cart_icon_at_top_right_corner() {

		buyProducts.cornerBtn();
	}

	@When("Click on Checkout button")
	public void click_on_checkout_button() {
	  
	    checkout.clickcheck();
	}

	@When("Enter your first name in First Name textbox")
	public void enter_your_first_name_in_first_name_textbox() {
	   
	    info.enterName("Tahera");
	}

	@When("Enter your last name in ast Name textbox")
	public void enter_your_last_name_in_ast_name_textbox() {
	    info.enterLastName("Atbin");
	}

	@When("Enter Postal Code in Postal Code textbox")
	public void enter_postal_code_in_postal_code_textbox() {
	    info.enterPstlcode("20910");
	}

	@When("Click on Continue button")
	public void click_on_continue_button() {
	    info.clickOnContinue();
	}

	@When("Click on Finish button on the next page")
	public void click_on_finish_button_on_the_next_page() {

	    finish.ClickonFinish();
	}

	@When("Verify the success message our order has been dispatched and will arrive just as fast as the pony can get there!")
	public void verify_the_success_message_our_order_has_been_dispatched_and_will_arrive_just_as_fast_as_the_pony_can_get_there() {
		
	    String expectedMsg = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
	    String actualMsg = succesMsg.getVerifyMsg();
	    Assert.assertEquals(actualMsg, expectedMsg);
	}

	@Then("Close the browser")
	public void close_the_browser() {
	
	    
	}

}
