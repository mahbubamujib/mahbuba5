package com.mahbuba;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Premierleage1 {
	public static void main(String[] args) throws Throwable {
		// Set the path to the chromedriver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		// instantiate a Chrome session
		WebDriver driver = new ChromeDriver();
		// Open browser and go to home page
		driver.get("https://www.premierleague.com/tables");
		// declare implicity wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//accepting all cookies by clicking on pop up
		driver.findElement(By.xpath("//*[contains(text(),'Accept All Cookies')]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		//identifying all team names from the website
		List<WebElement> teams = driver.findElements(By.xpath("//table/tbody/tr/td[3]/a/span[2]"));
		ArrayList<String> webTeams = new ArrayList<String>();
		ArrayList<String> exlTeams		= new ArrayList<String>();
		ArrayList<String> unMatchTeams = new ArrayList<String>();
		for (WebElement team : teams){
			webTeams.add (team.getText().trim());
			//System.out.printin(team.getText().trim());
		}
			System.out.println("All teams from the web page: "+webTeams);
		//giving location of the excel file where we will write the 20 names
		FileInputStream fis = new FileInputStream(new File("./excelSameer/excelfarsad1.xls"));
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet = wb.getSheetAt(0);
		//String value= sheet.getRow(3).getCell(®).getStringCellValue();
		for (int i=0;i<sheet.getLastRowNum();i++) {
		exlTeams.add(sheet.getRow(i).getCell(0).getStringCellValue());
		}
	System.out.println("All teams from excel doc:"+exlTeams);
	wb.close();
	for (String unMatch :webTeams) {
		if (exlTeams.contains (unMatch)){
		unMatchTeams.add(unMatch);
		//using for loop actually typing the names into excel file
//		for (int i = 0; i < teams.size(); i++) {
//			//printing each name into console
//			
//			System.out.println(teams.get(i).getText().trim());
//			sheet.getRow(i).getCell(0).setCellValue(teams.get(i).getText().trim());
//			FileOutputStream fso = new FileOutputStream("./excelJahid/ApacheReader.xls");
//			wb.write(fso);
		}
	}
	
	System.out.println("Missing teams in excel doc:			"+unMatchTeams);
	
	
	
	
	
	
	
	
	
	}
	}
