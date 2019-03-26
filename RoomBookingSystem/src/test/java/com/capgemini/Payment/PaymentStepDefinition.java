package com.capgemini.Payment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PaymentStepDefinition {
	
	private WebDriver driver;
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\chromedriver.exe" );
	}
	
	@Given("^User is on Payment page$")
	public void user_is_on_Payment_page() throws Throwable {
		driver = new ChromeDriver();
		driver.get("D:\\SatishTrainingData\\PaperSet\\BDD_Selenium\\SET08\\PaymentDetails.html");
		driver.manage().window().maximize();
	}

	@When("^User Click 'Make Payment' button without entering 'Card holder name'$")
	public void user_Click_Make_Payment_button_without_entering_Card_holder_name() throws Throwable {
	 
	}

	@Then("^'Please fill the Card holder name' message should display$")
	public void please_fill_the_Card_holder_name_message_should_display() throws Throwable {
	   
	}

	@When("^User Click 'Make Payment' button without entering 'Debit card Number'$")
	public void user_Click_Make_Payment_button_without_entering_Debit_card_Number() throws Throwable {
	  
	}

	@Then("^'Please fill the Debit card Number' message should display$")
	public void please_fill_the_Debit_card_Number_message_should_display() throws Throwable {
	    
	}

	@When("^User Click 'Make Payment' button without entering 'Please fill the CVV Number'$")
	public void user_Click_Make_Payment_button_without_entering_Please_fill_the_CVV_Number() throws Throwable {

	}

	@Then("^'Please fill the CVV' message should display$")
	public void please_fill_the_CVV_message_should_display() throws Throwable {
	    
	}

	@When("^User Click 'Make Payment' button without entering 'Expiration month'$")
	public void user_Click_Make_Payment_button_without_entering_Expiration_month() throws Throwable {
	  
	}

	@Then("^'Please fill expiration month' message should display$")
	public void please_fill_expiration_month_message_should_display() throws Throwable {
	  
	}

	@When("^User Click 'Make Payment' button without entering Expiration year'$")
	public void user_Click_Make_Payment_button_without_entering_Expiration_year() throws Throwable {
	
	}

	@Then("^'Please fill the expiration year' message should display$")
	public void please_fill_the_expiration_year_message_should_display() throws Throwable {
	    
	}
	
	@When("^User Click 'Make Payment' button after entering valid 'payment details'$")
	public void user_Click_Make_Payment_button_after_entering_valid_payment_details() throws Throwable { 
	}
	
	@Then("^'Conference Room Booking successfully done!!!' message should display$")
	public void conference_Room_Booking_successfully_done_message_should_display() throws Throwable {
	    
	}

}
