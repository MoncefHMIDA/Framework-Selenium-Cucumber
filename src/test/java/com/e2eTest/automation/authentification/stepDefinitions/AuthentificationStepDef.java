package com.e2eTest.automation.authentification.stepDefinitions;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.authentification.pageObjects.AuthentificationPage;
import com.e2eTest.automation.util.CommonMethodes;
import com.e2eTest.automation.util.Setup;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDef extends CommonMethodes {

	public WebDriver driver;
	private AuthentificationPage authentificationPage=new AuthentificationPage(driver);

	public AuthentificationStepDef() {

		driver=Setup.driver;
	}

	@Given("^open application$")
	public void openApplication() throws Throwable {

		logger.info("Open Browser");
		CommonMethodes.openBrowserWithConfigFile("url1");
		//String url="https://opensource-demo.orangehrmlive.com/";
		//driver.get(url);
	}

	@When("^set username$")
	public void setUsername() throws Throwable {

		PageFactory.initElements(driver, AuthentificationPage.class);
		logger.info("Send user name");
		authentificationPage.sendUserName();

	}

	@When("^set password$")
	public void setPassword() throws Throwable {
		logger.info("Send password");
		authentificationPage.sendUserPassword();

	}

	@When("^click login button$")
	public void clickLoginButton() throws Throwable {
		logger.info("Click on Button Login ");
		authentificationPage.clickLoginButton();

	}

	@Then("^show page admin$")
	public void showPageAdmin() throws Throwable {
		String wlc = AuthentificationPage.welcome.getText();
		Assert.assertTrue(wlc.contains("Welcome"));
		Assert.assertEquals("Welcome Linda", wlc);
	}
	@When("^click on Admin$")
	public void clickOnAdmin() throws Throwable {
		logger.info("Click on Admin");
		authentificationPage.clickLinkAdmin();
	}

	@When("^click on Buzz$")
	public void clickOnBuzz() throws Throwable {
		logger.info("Click on Buzz");
		authentificationPage.clickLinkBuzz();
	}
	

}