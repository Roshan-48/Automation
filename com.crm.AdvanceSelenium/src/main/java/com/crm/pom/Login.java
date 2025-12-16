package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(xpath = "//div[@class='orangehrm-login-branding']")
	private WebElement orangeHrm_logo;

	@FindBy(xpath = "//h5[text()='Login']")
	private WebElement login_header;
	
	@FindBy(name = "username")
	private WebElement username;
	
	@FindBy(css = "input[type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login_button;
	
	@FindBy(xpath = "//p[text()='Forgot your password?']")
	private WebElement forgot_password;
	
	@FindBy(xpath = "(//div[contains(@class,'orangehrm-login-footer-sm')]//a)[1]")
	private WebElement linkedin_icon;

	@FindBy(xpath = "(//div[contains(@class,'orangehrm-login-footer-sm')]//a)[2]")
	private WebElement facebook_icon;

	@FindBy(xpath = "(//div[contains(@class,'orangehrm-login-footer-sm')]//a)[3]")
	private WebElement twitter_icon;

	@FindBy(xpath = "(//div[contains(@class,'orangehrm-login-footer-sm')]//a)[4]")
	private WebElement youtube_icon;
	
	@FindBy(xpath = "//a[text()='OrangeHRM, Inc']")
	private WebElement footer_text;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void getOrangeHrm_logo() {
	    orangeHrm_logo.isDisplayed();
	}

	public void getLogin_header() {
	    login_header.isDisplayed();
	}

	public void getUsername(String data) {
		username.sendKeys(data);
	}

	public void getPassword(String data) {
		password.sendKeys(data);
	}

	public void getLogin_button() {
		login_button.click();
	}

	public void getForgot_password() {
		forgot_password.click();
	}
	
	public void getLinkedin_icon() { 
		linkedin_icon.click(); 
	}
	
	public void getFacebook_icon() { 
		facebook_icon.click(); 
	}
	
	public void getTwitter_icon() { 
		twitter_icon.click();
	}
	
	public void getYoutube_icon() { 
		youtube_icon.click(); 
	}
	
	public String getFooter_text() {
		footer_text.click();
		return footer_text.getText();
	}
}

