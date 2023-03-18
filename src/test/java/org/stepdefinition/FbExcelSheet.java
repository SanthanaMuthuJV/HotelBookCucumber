package org.stepdefinition;

import java.io.IOException;

import org.baseclasscu.BaseClassCucu;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.pojo.cucu.POJOLoginPage;

import cucumber.api.java.en.When;


public class FbExcelSheet extends BaseClassCucu{
	POJOLoginPage f;
	@When("user has to load the fb url")
	public void userHasToLoadTheFbUrl() {
	   urlLanch("https://www.facebook.com");
	}

	@When("user has to pass the username in email filed by using excelsheeet")
	public void userHasToPassTheUsernameInEmailFiledByUsingExcelsheeet() throws IOException {
	    f = new POJOLoginPage();
	    sendKeys(f.getEmailtxt(), dbDatas());

	}
	@When("user has to pass the passsword in pass filed by using excelsheet")
	public void userHasToPassThePassswordInPassFiledByUsingExcelsheet() throws IOException {
	    sendKeys(f.getPasstxt(), excelRead("D:\\forFblogin.xlsx", "Sheet1", 1, 1));
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background:green;border:5px solid red')", f.getPasstxt());
		Assert.assertTrue(" verify the password ", false);
	}

	@When("user has to click the login button in submit filed")
	public void userHasToClickTheLoginButtonInSubmitFiled() {
		
	    clickWebElement(f.getClickbtn());
	}
}
