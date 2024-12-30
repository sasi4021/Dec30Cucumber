package org.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginSteps {

	static WebDriver driver;

	@Given("The user should be Target home page")
	public void the_user_should_be_Target_home_page() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@When("The user clicks on login button")
	public void the_user_clicks_on_login_button() {

		driver.findElement(By.xpath("//span[text()='Sign in']")).click();

	}

	@When("User clicks on signin button")
	public void user_clicks_on_signin_button() {

		driver.findElement(By.xpath("//button[text()='Sign in']")).click();

	}

	@When("User enters the username and password")
	public void user_enters_the_username_and_password() {

		driver.findElement(By.id("username")).sendKeys("447658763");
		driver.findElement(By.id("password")).sendKeys("sasi1234");

	}

	@Then("User clickes on login button")
	public void user_clickes_on_login_button() {
		driver.findElement(By.id("login")).click();
		String str1 = driver.findElement(By.id("username--ErrorMessage")).getText();
		System.out.println(str1);
		driver.quit();

	}

	@Given("The User should be in Target Home Page")
	public void the_User_should_be_in_Target_Home_Page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@When("User enters the {string} and {string}")
	public void user_enters_the_and(String email, String password) {
		driver.findElement(By.id("username")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@Then("Verify the user name is Appeared on home page")
	public void verify_the_user_name_is_Appeared_on_home_page() {
		String str = driver.findElement(By.cssSelector(".sc-58ad44c0-3.kkWqdY.h-margin-r-x3")).getText();
		System.out.println(str);
	}

	@Then("User clickes on login button with valid data")
	public void user_clickes_on_login_button_with_valid_data() {
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("//a[text()='Skip']")).click();
		driver.findElement(By.xpath("//button[text()='Maybe later']")).click();
	}

}
