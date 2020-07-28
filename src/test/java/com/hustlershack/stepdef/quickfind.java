package com.hustlershack.stepdef;

import com.hustlershack.common.OSCBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class quickfind extends OSCBase{

	

	@Given("^I am on oscommerce homepage$")
	public void i_am_on_oscommerce_homepage() {
		LaunchBrowser();
	}

	@When("^I enter a hardware \"([^\"]*)\" name$")
	public void i_enter_a_hardware_name(String arg1)  {
	   
	}

	@Then("^I can view the products$")
	public void i_can_view_the_products() {
	   
	}

}
