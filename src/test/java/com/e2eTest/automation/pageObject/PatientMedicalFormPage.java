package com.e2eTest.automation.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PatientMedicalFormPage {
	WebDriver driver;
	public PatientMedicalFormPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	final static String FIRST_NAME_XPATH="//input[@id='first_45']";
	final static String LAST_NAME_XPATH="//input[@id='last_45']";
	final static String BUTTON_SUBMIT_XPATH="//*[@id=\"input_14\"]";
	
	/// **@FindBy **/

		@FindBy(how=How.XPATH, using= FIRST_NAME_XPATH)
		public static WebElement firstName;
		@FindBy(how=How.XPATH, using= LAST_NAME_XPATH)
		public static WebElement lastName;
		@FindBy(how=How.XPATH, using= BUTTON_SUBMIT_XPATH)
		public static WebElement btnSubmit;
		
		/// Methods /
		public void sendFirstName() {

			firstName.sendKeys("Moncef");
		}

		public void sendLastName() {

			lastName.sendKeys("HMIDA");
		}

		public void clickSubmit() {

			btnSubmit.click();
		}
}
