package com.demo.stepdefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SDLogin {
	
	@Given("^Launch Browser$")
	public void launch_Browser() throws Throwable {
	    
		 System.out.println("Launch Browser");
	   
	    
	}

	@Given("^navigate to url$")
	public void navigate_to_url() throws Throwable {
	   
		 System.out.println("navigate to url");
	    
	   
	}

	@Given("^Enter the username and password$")
	public void enter_the_username_and_password() throws Throwable {
	    
		 System.out.println("Enter the username and password");
	   
	}

	@When("^Click on sumbit$")
	public void click_on_sumbit() throws Throwable {
	   
		 System.out.println("click on sumbit");
	   
	}

	@Then("^Check Whether it is logged in or not$")
	public void check_Whether_it_is_logged_in_or_not() throws Throwable {
	    
		 System.out.println("Check Whether it is logged in or not");
	  
	}
	@Given("^Launch \"([^\"]*)\" browser$")
	public void launch_browser(String BrowserType) throws Throwable {
	   System.out.println("Enter the values for the user signup page:" + BrowserType);
	}

	@Given("^Enter the username and \"([^\"]*)\" password \"([^\"]*)\"$")
	public void enter_the_username_and_password(String sUsername, String sPassword) throws Throwable {
		System.out.println("enter the user name : "+sUsername +"entering password :" +sPassword);
	    
	}

    @When("^Create an user in signup page$")
   public void create_an_user_in_signup_page() throws Throwable {
   }

    @Then("^Check user created or not$")
    public void check_user_created_or_not() throws Throwable {
   }

}
