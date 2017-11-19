package com.aurotech.stepDefinition;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	
	private WebDriver driver;
	
	@Before
	public void setUpRemote() throws Throwable {
	
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setPlatform(Platform.XP);
		URL url=new URL("http://ec2-34-224-214-70.compute-1.amazonaws.com:4444/wd/hub");
		driver=new RemoteWebDriver(url, cap);
    //driver.get("http://ec2-34-227-96-149.compute-1.amazonaws.com:8080/SimpleWebApp/login");
	
		
	}
	
	//WebDriver driver;
	@Given("^Launch Firefox and start application$")
		public void launch_Firefox_and_start_application() throws Throwable {
		//System.setProperty("webdriver.gecko.driver","D:\\Profiles\\Durga\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		//driver=new FirefoxDriver();
						
		//driver.manage().window().maximize();
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
	@Then("^application should be closed$")
	public void application_should_be_closed() throws Throwable {
	    driver.quit();
	}

	
}
