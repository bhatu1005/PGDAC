package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumdatademo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.driver","C:\\Users\\CDAC\\Desktop\\SDM\\seleniumdataorjar\\geckdriver\\geckodriver.exe");
		WebDriver obj=new FirefoxDriver();
 
	//	obj.manage().window().maximize();
	//	obj.manage().window().minimize();
		obj.get("https://epaper.lokmat.com/main-editions/Jalgaon%20Main/-1/1");
		
	//	obj.manage().window().maximize();
		//	obj.manage().window().minimize(); 
		
	 
		
		 

	}

}
