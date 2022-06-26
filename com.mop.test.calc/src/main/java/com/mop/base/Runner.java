package com.mop.base;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

/*public  class Runner {
	@Test
	public void startTest() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Calc\\chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		HomeLoanCalculatorObjects HomeLoanCalc= new HomeLoanCalculatorObjects(driver);
		PageFactory.initElements(driver, HomeLoanCalc);
		

		
		//HomeLoanCalc.loanCalculation();
		//Thread.sleep(5000);
		HomeLoanCalc.validatingByGivingIncompleteData();
		Thread.sleep(5000);
		driver.close();
	}

}*/
