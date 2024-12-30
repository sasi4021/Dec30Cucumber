package org.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
      protected static WebDriver driver ;
	
	public WebDriver launchBrowser(String str)
	{
		if(str.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(str.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			driver = new EdgeDriver();
		}
		return driver;
		
		//driver = new ChromeDriver();
	}
	
	public static void get(String str)
	{
		driver.get(str);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	 
	public static void sendKeys(WebElement w, String value) {

	  w.sendKeys(value);

	}

	
	public static void click(WebElement w)
	{
		//driver.findElement(By.xpath(string)).click();
		w.click();
	}
	public static void tearDown() {
		driver.quit();

	}
	
	public static void dropDown(String String, String value)
	{
		WebElement e1 = driver.findElement(By.name(String));
		Select s = new Select(e1);
		s.selectByValue(value);
		
	}
	
	

}
