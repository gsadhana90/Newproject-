package com.logintestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import com.loginpageobjects.LoginPageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver;
	LoginPageObjects lp;
	@Given("User is on the login page")
	public void user_is_on_the_login_page() { 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cloud-test.vendolite.com/home/login");
	}
	@When("User enters username and password")
	public void user_enters_username_and_password() {
		lp = new LoginPageObjects(driver);
		lp.ClickUsername();
		lp.setUsername("loginuser@riota.in");
		lp.ClickPwd();
		lp.setPwd("12345678");
	}
	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
		lp.setSubmit();
	}
	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		try {
			Thread.sleep(3000);
			String expectedUrl = "https://cloud-test.vendolite.com/portal/home";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
