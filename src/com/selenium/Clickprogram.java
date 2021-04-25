package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Clickprogram {
	
public WebDriver driver;
	
	
	public Clickprogram() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
     }
	
	@Test
	public void firefoxProgram() {
		driver.get("https://accounts.lambdatest.com/register");
        //Relative xpath for organization field
		  driver.findElement(By.xpath("//input[@name='organization_name' or @placeholder='Organization/Company Name']")).sendKeys("Organisation");
	        
	        //Finding the full name field via xpath using AND
	        driver.findElement(By.xpath("//input[@name='name' and @placeholder='Full Name*']")).sendKeys("Kratika Ahire");
	        
	        //Finding the work email field via xpath using OR, where only one of the attribute defined is correct whereas the other incorrect and does not match, still this should work as one of them meets the condition.
	        driver.findElement(By.xpath("//input[@name='email' or @id='not present']")).sendKeys("Lambdatest");
	        
	        //Finding the password field via xpath using AND, where only one of the attribute defined is correct whereas the other incorrect and does not match,this should NOT work as one of them does not meets the condition.
	        driver.findElement(By.xpath("//input[@name='password' and @id='not present']")).sendKeys("Lambdatest");
 
        driver.close();
        
		  
		 

		}

			
		
	}
	
