package org.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsLogonWithExample {
	
	WebDriver driver;
	
	@Given("The user login into the application")
	public void the_user_login_into_the_application() {
		
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.target.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    
	}

	@When("User clicks on sign on button")
	public void user_clicks_on_sign_on_button() {
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	    
	}
	

	@When("User clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(1000);
	    
	}

	@When("User enters into the {string} and {string}")
	public void user_enters_into_the_and(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
	}

	@When("User clicks on skip and may be later button for next login")
	public void user_clicks_on_skip_and_may_be_later_button_for_next_login() throws InterruptedException {
		driver.findElement(By.id("login")).click();
		Thread.sleep(10);
		System.out.println("Next");
	    
	}

	@Then("User Get into the application with different credentials")
	public void user_Get_into_the_application_with_different_credentials() {
	
		System.out.println("Logged with different data");
		driver.quit();

	}

	

}
