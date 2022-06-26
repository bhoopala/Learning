package com.mop.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods extends PageBase {
	
	public CommonMethods(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void selectDropdownByVisibleText(String value, WebElement element) {	
		try {
		Select select =new Select( element);
		select.selectByVisibleText(value);
		System.out.println(value);
		}catch(Exception e) {
			System.out.println("Exception::::"+e.getMessage());
			
		}
		
	}

}
