package com.Batch24.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Guru99.pages.Home24page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Batch24steps {
	WebDriver driver;
	Home24page obj;
	@Given("^User go to Guru(\\d+) Demo home page for Batch(\\d+)$")
	public void user_go_to_Guru_Demo_home_page_for_Batch(int arg1, int arg2) throws Throwable {
				
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
		 driver=new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		obj = new Home24page(driver);
		    
	}
//
	@When("^User type the username$")
	public void user_type_the_username() throws Throwable {
//	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ziamukta");
	obj.getUsername().sendKeys("ziamukta");
//
	}
//
	@When("^User also type password$")
	public void user_also_type_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("ziamukta123");
		obj.getPassword().sendKeys("ziamukta123");
//	
//	    
	}
//
	@Then("^User click on the Login button$")
	public void user_click_on_the_Login_button() throws Throwable {
//		driver.findElement(By.xpath("//*[@name='submit']")).click();	  
	  obj.getSubmitBtn().click(); 
	}
//
	@Then("^User verify the Login Successfully screen$")
	public void user_verify_the_Login_Successfully_screen() throws Throwable {
		String expected="Login Successfully";
//		String actual=driver.findElement(By.xpath("//*[contains(text(),'Login Successfully')]")).getText();
		String actual=obj.getLoginSuccessfullyTxt().getText();
		Assert.assertTrue("Login Successfully message is not found",actual.contains(expected));  
	    
	}

}