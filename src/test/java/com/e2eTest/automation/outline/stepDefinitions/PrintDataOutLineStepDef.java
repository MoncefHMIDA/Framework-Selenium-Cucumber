package com.e2eTest.automation.outline.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.outline.pageObjects.PrintDataOutLinePage;
import com.e2eTest.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PrintDataOutLineStepDef {

	public WebDriver driver;
	private PrintDataOutLinePage printDataOutLinePage=new PrintDataOutLinePage(driver);

	public PrintDataOutLineStepDef() {
		driver=Setup.driver;
	}
	@Given("^open application Text Box$")
	public void openApplicationTextBox() throws Throwable {
		String url="https://demoqa.com/text-box";
		driver.get(url);

	}

	@When("^I want to print FullName \"([^\"]*)\"$")

	public void iWantToPrintFullName(String fullName) throws Throwable {
		PageFactory.initElements(driver, PrintDataOutLinePage.class);
		printDataOutLinePage.sendFullName(fullName);

	}

	@When("^I want to print Email \"([^\"]*)\"$")

	public void iWantToPrintEmail(String email) throws Throwable {
		printDataOutLinePage.sendEmail(email);
	}



}
