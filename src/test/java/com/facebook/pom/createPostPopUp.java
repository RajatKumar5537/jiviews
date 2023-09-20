package com.facebook.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createPostPopUp {

	@FindBy(xpath = "//span[text()='Photo/video']")
	private WebElement crPost;
	
	public createPostPopUp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setCrPost() {
		crPost.click();
	}
}
