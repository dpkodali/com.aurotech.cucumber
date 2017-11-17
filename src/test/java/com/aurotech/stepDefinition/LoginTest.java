package com.aurotech.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	
	WebDriver driver;
	@Given("^Launch Firefox and start application$")
	public void launch_Firefox_and_start_application() throws Throwable {
		System.setProperty("webdriver.gecko.driver","D:\\Profiles\\Durga\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://ec2-34-227-96-149.compute-1.amazonaws.com:8080/SimpleWebApp/login");
		
	}

	@When("^I enter valid username and valid password$")
	public void i_enter_valid_username_and_valid_password() throws Throwable {
		
		driver.findElement(By.id("userName")).sendKeys("tom");
		driver.findElement(By.id("password")).sendKeys("tom001");
		
	    
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.id("submit")).click();
		
	}

	
}
