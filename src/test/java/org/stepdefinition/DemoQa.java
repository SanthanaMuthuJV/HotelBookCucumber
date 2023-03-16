package org.stepdefinition;

import org.baseclasscu.BaseClassCucu;
import org.openqa.selenium.support.ui.Select;
import org.pojo.cucu.POJOToolsQA;

import cucumber.api.java.en.When;

public class DemoQa extends BaseClassCucu {

	POJOToolsQA d;

	@When("^To Launch The QemoQA Application$")
	public void to_Launch_The_QemoQA_Application() throws Throwable {

		urlLanch("https://www.toolsqa.com/selenium-training/#enroll-form");

	}

	@When("^To Pass The Valid Firstname in filed$")
	public void to_Pass_The_Valid_Firstname_in_filed() throws Throwable {
		d = new POJOToolsQA();
		sendKeys(d.getFirstName(), "sandal");
	}

	@When("^To Pass The Valid Lastname in filed$")
	public void to_Pass_The_Valid_Lastname_in_filed() throws Throwable {

		sendKeys(d.getLastName(), "muhtu");
	}

	@When("^To Pass The Valid Email in filed$")
	public void toPassTheValidEmailInFiled() throws Throwable {
		sendKeys(d.getEmail(), "jenijerry@gmail.com");
	}

	@When("^To Pass The Valid Mobilenumber in filed$")
	public void toPassTheValidMobilenumberInFiled() throws Throwable {
		sendKeys(d.getMobile(), "98765412230");
	}

	@When("^To Pass The Valid Country in filed$")
	public void toPassTheValidCountryInFiled() throws Throwable {
		Select s = new Select(d.getCountry());
		s.selectByIndex(8);
	}

	@When("^To Pass The Valid City in filed$")
	public void toPassTheValidCityInFiled() throws Throwable {
		sendKeys(d.getCity(), "indian");
	}

	@When("^To Pass The Valid Mgs in filed$")
	public void toPassTheValidMgsInFiled() throws Throwable {
		sendKeys(d.getMsg(), "verify and validation");
	}

	@When("^To Pass The Valid Code in filed$")
	public void toPassTheValidCodeInFiled() throws Throwable {
		clickWebElement(d.getSubmit());
		System.out.println("submited.............");
	}

	// Scenario outline

	@When("^To Launch The QemoQA Appln$")
	public void toLaunchTheQemoQAAppln() throws Throwable {
		urlLanch("https://www.toolsqa.com/selenium-training/#enroll-form");
		implicity();
	}

	@When("^To Pass The Valid Firstname\"([^\"]*)\"$")
	public void toPassTheValidFirstname(String f) throws Throwable {
		d = new POJOToolsQA();
		sendKeys(d.getFirstName(), f);
	}

	@When("^To Pass The Valid Lastname\"([^\"]*)\"$")
	public void toPassTheValidLastname(String e) throws Throwable {
		sendKeys(d.getLastName(), e);
	}

	@When("^To Pass The Valid Email\"([^\"]*)\"$")
	public void toPassTheValidEmail(String j) throws Throwable {
		sendKeys(d.getEmail(), j);
	}

	@When("^To Pass The Valid Mobilenumber\"([^\"]*)\"$")
	public void toPassTheValidMobilenumber(String c) throws Throwable {
		sendKeys(d.getMobile(), c);
	}

	@When("^Select The  Country$")
	public void selectTheCountry() throws Throwable {
		Select s = new Select(d.getCountry());
		s.selectByIndex(3);
	}

	@When("^To Pass The Valid City\"([^\"]*)\"$")
	public void toPassTheValidCity(String b) throws Throwable {
		sendKeys(d.getCity(), b);
	}

	@When("^To Pass The Valid Mgs\"([^\"]*)\"$")
	public void toPassTheValidMgs(String a) throws Throwable {
		sendKeys(d.getMsg(), a);
	}

	@When("^To Pass The Valid Code$")
	public void toPassTheValidCode() throws Throwable {
		clickWebElement(d.getSubmit());
		System.out.println("submited.............");

	}
}
