package com.facebook.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

	@FindBy(xpath = "(//div[@role='navigation'])[2]/span")
	private WebElement profile;

	public void setProfile() {
		profile.click();
	}

	@FindBy(xpath = "//span[text()='Log out']")
	private WebElement Logout;

	public void setLogout() {
		Logout.click();
	}

	@FindBy(xpath = "(//input[@type='search'])[1]")
	private WebElement search;


	@FindBy(xpath = "//span[text()='Create Story']")
	private WebElement CreateStory;


	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setSearch(String name) {
		search.click();
	}

	public void setCreateStory() {
		CreateStory.click();
	}

}
