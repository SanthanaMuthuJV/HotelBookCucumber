package org.pojo.cucu;

import org.baseclasscu.BaseClassCucu;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOLoginPage extends BaseClassCucu {
public POJOLoginPage() {
	PageFactory.initElements(driver, this);
}    
   @FindBy(id="email")
   private WebElement emailtxt;
   
   @FindBy(id="pass")
   private WebElement passtxt;
   
   @FindBy(name="login")
   private WebElement clickbtn;

public WebElement getEmailtxt() {
	return emailtxt;
}

public WebElement getPasstxt() {
	return passtxt;
}

public WebElement getClickbtn() {
	return clickbtn;
}


}
   

