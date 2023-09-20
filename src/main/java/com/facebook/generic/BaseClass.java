package com.facebook.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.facebook.pom.HomePage;
import com.facebook.pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	

	@BeforeClass
	public void openBrowser(){
		Reporter.log("Open Browser", true);
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
	}

	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close Browser",true);
		driver.quit();
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("Login", true);
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("un");
		String pw = f.getPropertyData("pw");
		driver.get(url);
		LoginPage lp= new LoginPage(driver);
		lp.setLogin(un, pw);
		

	}

	@AfterMethod
	public void logout() {
		Reporter.log("Logout", true);
		HomePage hp= new HomePage(driver);
		hp.setProfile();
		hp.setLogout();
	}
}
