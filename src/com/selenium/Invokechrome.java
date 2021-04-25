package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invokechrome {
	public WebDriver driver;
	
	@Test
	public void chromeProgram() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}
