package com.facebook.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class liveVdoPage {

	@FindBy(xpath = "//span[text()='Live video']")
	private WebElement liveVdo;

	public liveVdoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setLiveVdo() {
		liveVdo.click();
	}
}
