package com.Guru99.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Home24page {

	WebDriver driver;
public Home24page(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

	@FindBy(how = How.XPATH,using="//input[@name='userName']")
			private WebElement username;
	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}
	
	@FindBy(how = How.XPATH,using="//*[@name='password']")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	@FindBy(how = How.XPATH,using="//*[@name='submit']")
	private WebElement submitBtn;
	

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public void setSubmitBtn(WebElement submitBtn) {
		this.submitBtn = submitBtn;
	}

	@FindBy(how = How.XPATH,using="//*[contains(text(),'Login Successfully')]")
	private WebElement loginSuccessfullyTxt ;
	public WebElement getLoginSuccessfullyTxt() {
		return loginSuccessfullyTxt;
	}

	public void setLoginSuccessfullyTxt(WebElement loginSuccessfullyTxt) {
		this.loginSuccessfullyTxt = loginSuccessfullyTxt;
	}

}
