package com.saucedemo.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FourthScenarioSteps extends Driver{
	
	@Given("Go into Landing Page")
	public void go_into_landing_page() {
	
	}

	@When("Enter your username")
	public void enter_your_username() {
	   
	    landingPage.enterUserName("standard_user");
	}

	@When("Enter your password")
	public void enter_your_password() {
	    landingPage.enterPassword("secret_sauce");
	}

	@When("hit login button")
	public void hit_login_button() {
	    landingPage.clickLognBtn();
	}

	@When("Sort the item based on price from low to high")
	public void sort_the_item_based_on_price_from_low_to_high() {
	    
	    buyProducts.sortPrice("Price (low to high)");
	}

	@When("Add your first item")
	public void add_your_first_item() {
		
		buyProducts.buyThirdP();
	}
	

	@When("click on the cart")
	public void click_on_the_cart() {
		
		buyProducts.cornerBtn();
	}
	@When("Verify the same item which you selected on the previous page has been added to cart")
	public void verify_the_same_item_which_you_selected_on_the_previous_page_has_been_added_to_cart() {
	  
	WebElement confirmationMsg = driver.findElement(By.id("item_2_title_link"));
	String confirmationText = confirmationMsg.getText();
	if (confirmationText.contains("Sauce Labs Onesie")) {
		System.out.println("Item is the same as we selected");
	}
	else
	{System.out.println("the wrong item is slected");
	}
	}

	@When("click on the checout button")
	public void click_on_the_checout_button() {
	    
	    checkout.clickcheck();
	}

	@When("enter your first name")
	public void enter_your_first_name() {
	  
	    info.enterName("Tahera");
	}

	@When("enter your last name")
	public void enter_your_last_name() {
	    info.enterLastName("Atbin");
	    
	}

	@When("enter your postal code")
	public void enter_your_postal_code() {
	    info.enterPstlcode("20910");
	}

	@When("hit the continue button")
	public void hit_the_continue_button() {
	    info.clickOnContinue();
	}

	@When("hit the finish button")
	public void hit_the_finish_button() {
	   
	    finish.ClickonFinish();
	}

	@When("verfiy the success message")
	public void verfiy_the_success_message() {
	   
	    String expectedMsg = "Thank you for your order!";
	    String actualMsg = succesMsg.thankYouMsg();
	    Assert.assertEquals(actualMsg, expectedMsg);
	}

	@Then("close your browser at the end")
	public void close_your_browser_at_the_end() {
	    
	}

}
