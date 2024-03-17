package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//page factory 
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and @name='username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and @type='password' and @name='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit' and @class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	WebElement submitBtn;
	
	@FindBy(xpath = "//div[@class='orangehrm-login-logo-mobile' and img/@src='/web/images/ohrm_logo.png' and img/@alt='orangehrm-logo']")
	WebElement hrmLogo;
	
	//Initializing the page objects 
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateHrmLogo() {
		return hrmLogo.isDisplayed();
	}
	
	public Homepage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		submitBtn.click();
		
		return new Homepage();
	}

}
