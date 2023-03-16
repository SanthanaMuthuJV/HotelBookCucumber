package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.baseclasscu.BaseClassCucu;
import org.junit.Assert;
import org.pojo.cucu.POJOAmazon;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AmazonLogin extends BaseClassCucu {
	POJOAmazon a;

	@Given("^To Launch The Brower and Max The Browser$")
	public void to_Launch_The_Brower_and_Max_The_Browser() throws Throwable {
		browserLanch();
		maxWin();
	}

	@When("^To Launch The Amazon Application$")
	public void to_Launch_The_Amazon_Application() throws Throwable {
		urlLanch(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcss%2Fhomepage.html%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	}

	@When("^To Pass The Valid Username in email filed$")
	public void to_Pass_The_Valid_Username_in_email_filed(DataTable d) throws Throwable {
		a = new POJOAmazon();
		Map<String, String> m = d.asMap(String.class, String.class);
		sendKeys(a.getEmail(), m.get("emailthree"));
	 getInsertTxt(a.getEmail());
	}

	@When("^To Click The Continue button$")
	public void to_Click_The_Continue_button() throws Throwable {
		clickWebElement(a.getContibtn());
	}

	@When("^To Pass the Valid Password in Password filed$")
	public void to_Pass_the_Valid_Password_in_Password_filed(DataTable d) throws Throwable {
		List<Map<String, String>> m1 = d.asMaps(String.class, String.class);
		
		sendKeys(a.getPass(), m1.get(1).get("passtwo"));
		Assert.assertTrue("verify this failed", false);
		getInsertTxt(a.getPass());
	}

	@When("^To Click The Login button$")
	public void to_Click_The_Login_button() throws Throwable {
		clickWebElement(a.getSignbtn());
	}

	@Then("^Now To Close The Browser$")
	public void now_To_Close_The_Browser() throws Throwable {

		
	}

}
