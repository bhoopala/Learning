package com.mop.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeLoanCalculatorObjects extends CommonMethods {
	public HomeLoanCalculatorObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
/*
	 * WebDriver driver;
	 * 
	 * public HomeLoanCalculatorObjects(WebDriver idriver) { this.driver=idriver; }
	 */
        CommonMethods Cm= new CommonMethods(driver);
	    @FindBy(xpath="//label[starts-with(text(),'Single')]")
	    WebElement ApplicationType;
	    
	    @FindBy(xpath="//label[text()='Number of dependants']//following::select[@title='Number of dependants']")
	    WebElement Dependents;
	    
	    @FindBy(xpath="//label[starts-with(text(),'Home')]")
	    WebElement PropertyType;
	    
	     @FindBy(xpath="//input[@aria-labelledby='q2q1']")
	    WebElement AnnualIncome;
	    
	    @FindBy(xpath="//input[@aria-labelledby='q2q2']")
	    WebElement OtherIncome;
	    
	    @FindBy(xpath="//input[@aria-labelledby='q3q1']")
	    WebElement LivingExpense;
	    
	    @FindBy(xpath="//label[starts-with(text(),'Current home')]//following::div[1]")
	    WebElement MonthlyRepayments;
	    
	    @FindBy(xpath="//input[@id='otherloans']")
	    WebElement OtherLoanRepayments;
	    
	    public @FindBy(xpath="//label[starts-with(text(),'Other monthly')]//following::div[1]")
	    WebElement MonthlyCommitments;
	    
	    @FindBy(xpath="//label[starts-with(text(),'Total credit')]//following::div[1]")
	    WebElement TotalCreditCardLimits;
	    
	    @FindBy(xpath="//button[@id='btnBorrowCalculater']")
	    WebElement BorrowEstimate;
	    
	    @FindBy(id="borrowResultTextAmount")
	    WebElement EstimateAmount;
	  
	    @FindBy(xpath="//button[@aria-label='Start over']")
	    WebElement StartOver;
	    
	    @FindBy(xpath="//div[contains(text(),'Based on')]")
	    WebElement errorMsg;
	    
	    @FindBy(xpath="//div[@class='hero__contentRow hero__contentRow--textBanner']//following::h1")
	    WebElement LandingPage;
	    
	    private String xpath="//div[@class='hero__contentRow hero__contentRow--textBanner']//following::h1";
	 
	       public void navigatingToCalculatorsAndToolsPage() {
	    	   try {
	    		WebDriverWait wait= new WebDriverWait(driver, 120,500);
	    		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(xpath))));
	    	   String Expected= LandingPage.getText();
	    	   if(Expected.equalsIgnoreCase("How much could I borrow?")) {
	    		   System.out.println("Successfuly verified that user lands on Calculators and tool page");
	    	   }else {
	    		   System.out.println("No such Page");
	    	   }
	    			   
	    	   }catch(Exception e) {
	    		   System.out.println("Exception: "+e.getMessage());
	    	   }
	       }
	    
	    	public void loanCalculation() throws InterruptedException {
	    	try {	
	    	if(ApplicationType.isEnabled()) {
	    		System.out.println("Application type is selected as Single");
	    	}else {
	    		ApplicationType.click();
	    	}
	    	Cm.selectDropdownByVisibleText("0", Dependents);
	    	if(PropertyType.isEnabled()) {
	    		System.out.println("PropertyType type is selected as Home to Livein");
	    	}else {
	    		PropertyType.click();
	    	}
	    	AnnualIncome.sendKeys("80,000");
	    	Thread.sleep(2000);
	    	OtherIncome.sendKeys("10,000");
	    	Thread.sleep(2000);
	    	LivingExpense.sendKeys("500");
	    	Thread.sleep(2000);
	    	OtherLoanRepayments.sendKeys("100");
	    	Thread.sleep(2000);
	    	BorrowEstimate.click();
	    	Thread.sleep(2000);
	    	String expected="$479,000";
	    	String Actual= EstimateAmount.getText();
	    	if(Actual.equals(expected)) {
	    		System.out.println("The Estimated Amount is as per Expected");
	    	}else {
	    		System.out.println("The Estimated Amount is not as per Expected");
	    	}
	    	}catch(Exception e) {
	    		System.out.println(e.getMessage());
	    	}
	    	driver.close();
	    		
	    	}
	    	public void checkingStartOverButton() throws InterruptedException {
	    		try {
	    	 	if(ApplicationType.isEnabled()) {
		    		System.out.println("Application type is selected as Single");
		    	}else {
		    		ApplicationType.click();
		    	}
		    	Cm.selectDropdownByVisibleText("1", Dependents);
		    	if(PropertyType.isEnabled()) {
		    		System.out.println("PropertyType type is selected as Home to Livein");
		    	}else {
		    		PropertyType.click();
		    	}
		    	AnnualIncome.sendKeys("80,000");
		    	Thread.sleep(2000);
		    	OtherIncome.sendKeys("10,000");
		    	Thread.sleep(2000);
		    	LivingExpense.sendKeys("500");
		    	Thread.sleep(2000);
		    	OtherLoanRepayments.sendKeys("100");
		    	Thread.sleep(2000);
		    	BorrowEstimate.click();
		    	Thread.sleep(2000);
		    	StartOver.click();
		    	Thread.sleep(2000);
		    	String reset=EstimateAmount.getText();
		    	String str="0";
		    	if(reset.equals(str)) {
		    		System.out.println("Successfull clicked Startover");
		    	}else {
		    		System.out.println("Unable to click Startover button");
		    	}
	    		}catch(Exception e) {
	    			System.out.println(e.getMessage());
	    		}
	    		driver.close();
	    	
	    }
	    	public void validatingByGivingIncompleteData() {
	    		try {
	    		LivingExpense.sendKeys("1");
	    		Thread.sleep(2000);
	    		BorrowEstimate.click();
	    	    Thread.sleep(2000);
	    	    String expectederrormsg=errorMsg.getText();
	    	    System.out.println(expectederrormsg);
	    	    String ActualErrorMessage="Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.";
	    	    if(expectederrormsg.equals(ActualErrorMessage)) {
	    	    	System.out.println("Error message successfully verified");
	    	    }else {
	    	    	System.out.println("Incorrect error message");
	    	    }
	    	    
	    		}catch(Exception e) {
	    			System.out.println("Exception: "+e.getMessage());
	    		}
	    		driver.close();
	    	}
	    
	    
	  
	    
	  


}
