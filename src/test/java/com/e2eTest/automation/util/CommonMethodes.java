package com.e2eTest.automation.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


public class CommonMethodes {

	public static WebDriver driver;
	public CommonMethodes() {

		driver=Setup.driver;
	}
	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);
	public void scrollerBottom() {

		for (int second = 0;; second++) {
			if (second >= 60) {
				break;
			}
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
		}

	}

	public void scrollerTop() {

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollTo(" + 0 + "," + 0 + ")", "");

	}

	public void refreshBrowser() {

		driver.navigate().refresh();

	}

	public void goBack() {

		driver.navigate().back();

	}

	public void forward() {

		driver.navigate().forward();

	}

}
