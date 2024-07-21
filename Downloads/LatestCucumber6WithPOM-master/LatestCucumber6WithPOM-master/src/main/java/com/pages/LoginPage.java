package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	

	// 1. By Locators: OR
	private By emailId = By.xpath("//input[@placeholder='Username']");
	private By password = By.xpath("//input[@placeholder='Password']");
	private By signInButton = By.xpath("//button[normalize-space()='Login']");
	private By forgotPwdLink = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
	
	

	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean isForgotPwdLinkExist() throws InterruptedException {
		Thread.sleep(4000);
		return driver.findElement(forgotPwdLink).isDisplayed();
	}

	public void enterUserName(String username) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(emailId).sendKeys(username);
	}

	public void enterPassword(String pwd) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnLogin() {
		driver.findElement(signInButton).click();
	}

	public AccountsPage doLogin(String un, String pwd) {
		System.out.println("login with: " + un + " and " + pwd);
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signInButton).click();
		return new AccountsPage(driver);
	}

}
