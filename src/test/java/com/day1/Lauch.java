package com.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lauch {

	public static void main(String[] args) {

		BaseClass lib = new BaseClass();
		
		lib.launchBrowser("chrome");
		lib.launchBrowser("explorer");
	

	}
}
