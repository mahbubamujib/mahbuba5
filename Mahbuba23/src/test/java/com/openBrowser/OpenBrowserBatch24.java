package com.openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserBatch24 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//	driver.get("https://opensource-demo.orangehrmlive.com/");
//	driver.manage().window().maximize();
//	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
//	driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
//	driver.findElement(By.name("Submit")).click();
	driver.get("https://demo.guru99.com/test/newtours/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("ziamukta");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ziamukta123");
	driver.findElement(By.name("submit")).click();
}
}