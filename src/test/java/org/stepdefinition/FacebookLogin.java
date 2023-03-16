package org.stepdefinition;

import java.util.List;

import org.baseclasscu.BaseClassCucu;
import org.pojo.cucu.POJOLoginPage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class FacebookLogin extends BaseClassCucu{
	POJOLoginPage p;
	@Given("^user has to load the Browser and Max the Window$")
	public void user_has_to_load_the_Browser_and_Max_the_Window() throws Throwable {
	    browserLanch();
	    maxWin();
	}

	@When("^user has to load the FaceBook Application$")
	public void user_has_to_load_the_FaceBook_Application() throws Throwable {
	   urlLanch("https://www.facebook.com/");
	}

	@When("^user has to pass the invalid username in email field$")
	public void user_has_to_pass_the_invalid_username_in_email_field(DataTable d) throws Throwable {
	   p= new POJOLoginPage();
	   List<String> l = d.asList(String.class);
	   
	   sendKeys(p.getEmailtxt(), l.get(1));
	}

	@When("^user has to pass the invalid password in password field$")
	public void user_has_to_pass_the_invalid_password_in_password_field(DataTable d) throws Throwable {
		List<List<String>> ls = d.asLists(String.class);
	   sendKeys(p.getPasstxt(), ls.get(1).get(1));
	}

	@When("^user has to click the login button$")
	public void user_has_to_click_the_login_button() throws Throwable {
	   clickWebElement(p.getClickbtn());
	}

	@Then("^user has to close the browser$")
	public void user_has_to_close_the_browser() throws Throwable {
	   
	}
	
	
	//2nd scenarios
	
	@Given("^to launch the browser and max$")
	public void to_launch_the_browser_and_max() throws Throwable {
	   browserLanch();
	   maxWin();
	}

	@When("^to launch the url the facebook application$")
	public void to_launch_the_url_the_facebook_application() throws Throwable {
		urlLanch("https://www.facebook.com/");
	}

	

	@When("^to pass postive and neagative data  in email field\"([^\"]*)\"$")
	public void to_pass_postive_and_neagative_data_in_email_field(String em) throws Throwable {
		p= new POJOLoginPage();
	   sendKeys(p.getEmailtxt(), em);
	}

	@When("^to pass postive and negative data in password field  \"([^\"]*)\"$")
	public void to_pass_postive_and_negative_data_in_password_field(String pass) throws Throwable {
		p= new POJOLoginPage();
	   sendKeys(p.getPasstxt(), pass);
	}
	

	@Then("^To close te browser$")
	public void to_close_te_browser() throws Throwable {
	    
	}

	
	
	
	
}
