package com.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public void launchBrowser(String browser) {
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		}if (browser.equals("explorer")) {
			WebDriverManager.iedriver().setup();
			WebDriver driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		
		

	}

}
