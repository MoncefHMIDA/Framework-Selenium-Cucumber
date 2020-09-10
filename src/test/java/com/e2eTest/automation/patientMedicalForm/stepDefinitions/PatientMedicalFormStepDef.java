package com.e2eTest.automation.patientMedicalForm.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.patientMedicalForm.pageObjects.PatientMedicalFormPage;
import com.e2eTest.automation.util.CommonMethodes;
import com.e2eTest.automation.util.Setup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PatientMedicalFormStepDef {


	public WebDriver driver;
	private PatientMedicalFormPage patientMedicalFormPage=new PatientMedicalFormPage(driver);
	private CommonMethodes commonMethods =new CommonMethodes();

	public PatientMedicalFormStepDef() {

		driver=Setup.driver;
	}

	@Given("^open applicationform$")
	public void openApplication() throws Throwable {

		String url="https://form.jotform.com/81665408084158";
		driver.get(url);
	}
	@When("^set firstname$")
	public void setUsername() throws Throwable {

		PageFactory.initElements(driver, PatientMedicalFormPage.class);
		patientMedicalFormPage.sendFirstName();

	}
	@When("^set lastname$")
	public void setPassword() throws Throwable {

		patientMedicalFormPage.sendLastName();

	}
	@When("^click login submit$")
	public void clickLoginButton() throws Throwable {
		commonMethods.scrollerBottom();
		patientMedicalFormPage.clickSubmit();
	}
}
