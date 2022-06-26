package com.mop.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;



public class PageBase {
	/*
	 * WebDriver driver; public PageBase(WebDriver driver) { this.driver= driver;
	 * 
	 * }
	 */
	public WebDriver driver;
	private static final String KILL = "taskkill /F /IM ";
	public PageBase(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		

	}

	public PageBase(RemoteWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public static void _killProcess(String serviceName) throws Exception {

		Runtime.getRuntime().exec(KILL + serviceName);
		_killProcess("chromedriver");
		Thread.sleep(5000);
		
		_killProcess("chrome.exe");
		Thread.sleep(5000);							
		System.out.println("Closed the Existing Chrome Browsers");

	}
	

}
