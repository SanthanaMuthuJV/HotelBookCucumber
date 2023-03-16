package org.pojo.cucu;

import org.baseclasscu.BaseClassCucu;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class POJOToolsQA extends BaseClassCucu{
	public POJOToolsQA() {
		PageFactory.initElements(driver, this);
	}	
		
		@FindBy(xpath="//a[text()='Go To Registration ']")
		private WebElement regisClick;
		
		@FindBy(id="first-name")
		private WebElement firstName;
		
		@FindBy(id="last-name")
		private WebElement lastName;
		
		@FindBy(id = "email")
		private WebElement email;
		
		@FindBy(id="mobile")
		private WebElement mobile;
		
		@FindBy(name="country")
		private WebElement country;
		
		@FindBy(id="city")
		private WebElement city;
		
		@FindBy(id="message")
		private WebElement msg;
		
		@FindBy(xpath="//button[text()='Send']")
		private WebElement submit;

		public WebElement getRegisClick() {
			return regisClick;
		}

		public WebElement getFirstName() {
			return firstName;
		}

		public WebElement getLastName() {
			return lastName;
		}

		public WebElement getEmail() {
			return email;
		}

		public WebElement getMobile() {
			return mobile;
		}

		public WebElement getCountry() {
			return country;
		}

		public WebElement getCity() {
			return city;
		}

		public WebElement getMsg() {
			return msg;
		}

		public WebElement getSubmit() {
			return submit;
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
