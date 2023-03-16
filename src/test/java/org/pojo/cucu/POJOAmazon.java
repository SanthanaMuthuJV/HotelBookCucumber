package org.pojo.cucu;

import org.baseclasscu.BaseClassCucu;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOAmazon extends BaseClassCucu{
public POJOAmazon() {
	PageFactory.initElements(driver, this);
}

@FindBy(id = "ap_email")
private WebElement email;

@FindBy(id = "continue")
private WebElement contibtn;

@FindBy(id = "ap_password")
private WebElement pass;

@FindBy(id = "signInSubmit")
private WebElement signbtn;

public WebElement getEmail() {
	return email;
}

public WebElement getContibtn() {
	return contibtn;
}

public WebElement getPass() {
	return pass;
}

public WebElement getSignbtn() {
	return signbtn;
}











}
