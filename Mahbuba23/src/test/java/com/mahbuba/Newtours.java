package com.mahbuba;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;





public class Newtours {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("ziamukta");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("ziamukta123");
		driver.findElement(By.xpath("//*[@name='submit']")).click();	
		
		String expected="Login Successfully";
		String actual=driver.findElement(By.xpath("//*[contains(text(),'Login Successfully')]")).getText();
		Assert.assertTrue(actual.contains(expected));	
		
		driver.findElement(By.xpath("//*[contains(text(),'Flights')]")).click();
				driver.findElement(By.xpath("//*[@value='oneway']")).click();
       WebElement oneway= driver.findElement(By.xpath("//*[@value=\"oneway\"]"));
       oneway.click();         
		WebElement obj=driver.findElement(By.xpath("//*[@name='passCount']"));
		obj.click();
		Select passcount=new Select(obj);
		passcount.selectByIndex(1);
		
		WebElement fromPort=driver.findElement(By.xpath("//*[@name='fromPort']"));
		fromPort.click();
		Select fromport=new Select(fromPort);
		fromport.selectByVisibleText("New York");
		
		WebElement fromMonth=driver.findElement(By.xpath("//*[@name='fromMonth']"));
		fromMonth.click();
		Select frommonth=new Select(fromMonth);
		frommonth.selectByVisibleText("March");
		
		WebElement fromDay=driver.findElement(By.xpath("//*[@name='fromDay']"));
		fromDay.click();
		Select fromday=new Select(fromDay);
		fromday.selectByIndex(29);
		
		WebElement toMonth=driver.findElement(By.xpath("//*[@name='toMonth']"));
		toMonth.click();
		Select tomonth=new Select(toMonth);
		tomonth.selectByIndex(9);
		
		WebElement toDay=driver.findElement(By.xpath("//*[@name='toDay']"));
	     toDay.click();
		Select today=new Select(toDay);
 	    today.selectByIndex(9);
	    
  driver.findElement(By.xpath("//*[@value='Business']")).click();	   
		
 	 WebElement airline=driver.findElement(By.xpath("//*[@name='airline']"));
     airline.click();
     Select Airline=new Select(airline);
     Airline.selectByIndex(1);    

   WebElement findFlights=driver.findElement(By.xpath("//*[@name='findFlights']"));
  findFlights.click();
  
  String expected1="4";
//   String actual2=driver.findElement(By.xpath("//*[contains(text(),'4')]")).getText();
   String actual2=driver.findElement(By.xpath("(//*[@size='4'])[2]")).getText();
   Assert.assertTrue(actual.contains(expected));
		
        
				
		
	}

}
