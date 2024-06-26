package com.loginpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageObjects {
	WebDriver driver;
	WebDriverWait wait;

	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='mat-tab-label-content' and text()='Company']")
	private WebElement company;

	@FindBy(xpath="//input[@name='username']")
	private WebElement emailid1;

	@FindBy(xpath="//div[@class='mat-form-field-flex ng-tns-c27-0']")
	private WebElement emailid;

	@FindBy(xpath="//div[@class='mat-form-field-flex ng-tns-c27-1']")
	private WebElement password;

	@FindBy(xpath="//input[@name='password']")
	private WebElement password1;

	@FindBy(xpath="//span[@class= 'mat-button-wrapper'and text()=' Login ']")
	private WebElement submit;
   
	public void ClickUsername() {
		this.wait.until(ExpectedConditions.elementToBeClickable(emailid));
	}
	public void setUsername(String username) {
		emailid1.sendKeys(username);
	}
	public void ClickPwd() {
		password.click();
	}
	public void setPwd(String Password) {
		password1.sendKeys(Password);
	}
	public void setSubmit() {
		submit.click();
	}
	
}
