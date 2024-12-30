package org.stepdefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.LoginPage;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepsLoginWithDataTable extends BaseClass {
	
	//WebDriver driver ;
	LoginPage l;
	
	
	
	@Given("The User should launch the application")
	public void the_User_should_launch_the_application() {
	//launchBrowser("chrome");
	//	get("https://www.target.com/");		
	   
	}

	@When("User clicks on the sign-in button")
	public void user_clicks_on_the_sign_in_button() {
		l = new LoginPage();
	//	driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		click(l.getAccountSignIn());
		
		String txt = driver.findElement(By.xpath("//div[contains(text(),' information and much more.')]")).getText();
		System.out.println(txt);
		Assert.assertTrue(txt,true);
	}

	@When("User clicks on the Sign-in again")
	public void user_clicks_on_the_Sign_in_again() {
		//driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		click(l.getSignInBtn());
	   
	}


	@When("User clicks on login button in sign-account page")
	public void user_clicks_on_login_button_in_sign_account_page() {
		//driver.findElement(By.id("login")).click();
		//click(l.getLoginBtn());
	}
    //with header 2d
	@When("User enters the username and password by using withHeader oneD")
	public void user_enters_the_username_and_password_by_using_withHeader_oneD(io.cucumber.datatable.DataTable data) {
		
		Map<String,String> mp = data.asMap(String.class,String.class);
		
		
		sendKeys(l.getUserName(), mp.get("username"));
		sendKeys(l.getPassWord(), mp.get("password"));
		
//		driver.findElement(By.id("username")).sendKeys(mp.get("username"));
//		driver.findElement(By.id("password")).sendKeys(mp.get("password"));
		System.out.println("username - "+ mp.get("usermane") + "password - " + mp.get("password"));
		
	}

	//same step with different message by passing parameter
	@Then("User get into the application {string}")
	public void user_get_into_the_application(String string) {
		
		if(string.equalsIgnoreCase("using withHeader oneD"))
		{
			System.out.println("Logged by using withHeader oneD");
			driver.quit();
		}
		else if(string.equalsIgnoreCase("using withHeader twoD"))
		{
			System.out.println("Logged by using withHeader twoD");
			driver.quit();
		}
		else if(string.equalsIgnoreCase("using without Header oneD"))
		{
			System.out.println("Logged by using withHeader oneD");
			driver.quit();
			
		}
		else if(string.equalsIgnoreCase("without Header twoD"))
		{
			System.out.println("Logged by without Header twoD");
			driver.quit();
		}
	   
	}

	@When("User enters the username and password by using withHeader twoD")
	public void user_enters_the_username_and_password_by_using_withHeader_twoD(io.cucumber.datatable.DataTable data) {
	 
		List<Map<String,String>> li = data.asMaps();
		
		Map<String, String> mp = li.get(1);
		
		
		sendKeys(l.getUserName(), li.get(1).get("username"));
		sendKeys(l.getPassWord(), li.get(1).get("password"));
		
		//driver.findElement(By.id("username")).sendKeys(li.get(1).get("username"));
	//	driver.findElement(By.id("password")).sendKeys(li.get(1).get("password"));
		System.out.println("username - "+ li.get(1).get("username") + "password - " + li.get(1).get("password"));
		
	}

	@When("User enters the username and password by using Without Header oneD")
	public void user_enters_the_username_and_password_by_using_Without_Header_oneD(io.cucumber.datatable.DataTable data) {

		List<String> li = data.asList();
		
		sendKeys(l.getUserName(), li.get(0));
		sendKeys(l.getPassWord(), li.get(1));
		
//		driver.findElement(By.id("username")).sendKeys(li.get(0));
//		driver.findElement(By.id("password")).sendKeys(li.get(1));
		System.out.println("username - "+ li.get(0) + "password - " + li.get(1));
	}

	@When("User enters the username and password by using without Header twoD")
	public void user_enters_the_username_and_password_by_using_without_Header_twoD(io.cucumber.datatable.DataTable data) {
	   
		List<List<String>> li = data.asLists();
		
		sendKeys(l.getUserName(), li.get(1).get(0));
		sendKeys(l.getPassWord(), li.get(1).get(1));
		
//		driver.findElement(By.id("username")).sendKeys(li.get(1).get(0));
//		driver.findElement(By.id("password")).sendKeys(li.get(1).get(1));
		System.out.println("username - "+ li.get(1).get(0) + " password - " + li.get(1).get(1));
		
		
	}






}
