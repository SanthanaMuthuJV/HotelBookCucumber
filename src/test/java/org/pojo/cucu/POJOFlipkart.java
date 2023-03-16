package org.pojo.cucu;

import org.baseclasscu.BaseClassCucu;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOFlipkart extends BaseClassCucu {
public POJOFlipkart() {
PageFactory.initElements(driver, this);}
 @FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
 private WebElement logimNumber;
 
 @FindBy(xpath="//button[text()='Request OTP']")
 private WebElement otpBtn;

public WebElement getLogimNumber() {
	return logimNumber;
}

public WebElement getOtpBtn() {
	return otpBtn;
}
 
 
 

}
