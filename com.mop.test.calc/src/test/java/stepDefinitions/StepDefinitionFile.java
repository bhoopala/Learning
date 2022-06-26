package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mop.base.CommonMethods;
import com.mop.base.HomeLoanCalculatorObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionFile {

	
	HomeLoanCalculatorObjects HC;

	@Given("user navigates to home page")
	public void user_navigates_to_home_page() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//chromedriver");
		WebDriver driver = new ChromeDriver();
		HC = new HomeLoanCalculatorObjects(driver);
		driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@When("user lands on home page")
	public void user_lands_on_home_page() throws InterruptedException {
		HC.navigatingToCalculatorsAndToolsPage();
	}

	@Then("User inputs data to check the functionality of the calculator")
	public void user_inputs_data_to_check_the_functionality_of_the_calculator() throws InterruptedException {
		HC.loanCalculation();
		Thread.sleep(5000);
	}


	@Then("Click start Over button on submitting") public void
	click_start_over_button_on_submitting() throws InterruptedException {
		HC.checkingStartOverButton(); Thread.sleep(5000);}

	@Then("User inputs incomplete data and check the error message")
	public void user_inputs_incomplete_data_and_check_the_error_message() throws InterruptedException {
		HC.validatingByGivingIncompleteData();
		Thread.sleep(5000);}


}
