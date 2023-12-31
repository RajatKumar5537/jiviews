package com.facebook.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.generic.BaseClass;
import com.facebook.generic.WebUtilities;


public class jiviewsMainMenuItems extends BaseClass{

	WebUtilities webUtility;

	@FindBy(xpath = "//span[text()='SYSTEM SETUP']/..")
	private WebElement mainMenu;

	@FindBy(xpath = "//span[text()='System Setup']/..")
	private WebElement selectSystemSetup;

	@FindBy(xpath = "//span[text()='System Definitions']/..")
	private WebElement selectSystemDefination;

	@FindBy(xpath = "//span[text()='Employee Administration']/..")
	private WebElement selectEmployeeAdministration;

	@FindBy(xpath = "//span[text()='Workforce Scheduling']/..")
	private WebElement selectWorkforceScheduling;

	@FindBy(xpath = "//span[text()='Employee Self Service']/..")
	private WebElement selectEmployeeSelfService;

	@FindBy(xpath = "//span[text()='Operation Planning & Execution']/..")
	private WebElement selectOperationPlanningExecution;

	@FindBy(xpath = "//span[text()='Time & Attendance']/..")
	private WebElement selectTimeAttendance;

	@FindBy(xpath = "//span[text()='Reports']/..")
	private WebElement selectReports;

	@FindBy(xpath = "//span[text()='Dashboard']/..")
	private WebElement selectDashboard;


	public jiviewsMainMenuItems(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
		this.webUtility= new WebUtilities(driver);
	}

	public void  clickMainMenu() {
		webUtility.ElementClickable(driver, mainMenu);
		mainMenu.click();
	}

	//	public void setSelectSystemSetup() {
	//		selectSystemSetup.click();
	//	}

	public void clickSelectSystemDefination() {
		webUtility.ElementClickable(driver, selectSystemDefination);
		selectSystemDefination.click();
	}
	public void clickOnSystemDefination()  {

		//		jiviewsMainMenuItems jmmi=new jiviewsMainMenuItems(driver);
		clickMainMenu();
		clickSelectSystemDefination();
	}
	//	public void setSelectEmployeeAdministration() {
	//		selectEmployeeAdministration.click();
	//	}
	//	public void setSelectWorkforceScheduling() {
	//		selectWorkforceScheduling.click();
	//	}
	//
	//	public void setSelectEmployeeSelfService() {
	//		selectEmployeeSelfService.click();
	//	}
	//	public void setSelectOperationPlanningExecution() {
	//		selectOperationPlanningExecution.click();
	//	}
	//	public void setSelectTimeAttendance() {
	//		selectTimeAttendance.click();
	//	}
	//
	//	public void setSelectReports() {
	//		selectReports.click();
	//	}
	//	
	//	public void setSelectDashboard() {
	//		selectDashboard.click();
	//	}


}
