package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.baseclasscu.BaseClassCucu;
import org.pojo.cucu.POJOAmazon;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class TestFeatureRepo extends BaseClassCucu {

	POJOAmazon a;

	@Given("^User has to launch the browser and maximize the window$")
	public void user_has_to_launch_the_browser_and_maximize_the_window() throws Throwable {
		browserLanch();
		maxWin();
	}
	
	@When("^To Launch The Amazon Appln$")
	public void to_Launch_The_Amazon_Appln() throws Throwable {
		urlLanch(
				"\"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcss%2Fhomepage.html%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&\");\r\n");
	}

	@When("^To Pass The Invalid Username in email filed$")
	public void to_Pass_The_Invalid_Username_in_email_filed(DataTable d) throws Throwable {
		a = new POJOAmazon();
		Map<String, String> m = d.asMap(String.class, String.class);
		sendKeys(a.getEmail(), m.get("emailthree"));
	}

	@When("^To Click The Continue btn$")
	public void to_Click_The_Continue_btn() throws Throwable {
		clickWebElement(a.getContibtn());
	}

	@When("^To Pass the Invalid Password in Password filed$")
	public void to_Pass_the_Invalid_Password_in_Password_filed(DataTable d) throws Throwable {
		List<Map<String, String>> m1 = d.asMaps(String.class, String.class);

		sendKeys(a.getPass(), m1.get(1).get("passtwo"));	}

	@When("^To Click The Login btn$")
	public void to_Click_The_Login_btn() throws Throwable {
		clickWebElement(a.getSignbtn());
	}

	@Then("^User has to close the Browser$")
	public void user_has_to_close_the_Browser() throws Throwable {
		

	}
}
