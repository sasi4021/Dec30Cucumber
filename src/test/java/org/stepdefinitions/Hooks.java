package org.stepdefinitions;

import org.base.BaseClass;
import org.pom.LoginPage;

import io.cucumber.java.*;

public class Hooks extends BaseClass {
	
	LoginPage l;
	@Before
	public void beforeClass()
	{
		System.out.println("Before Class");
		launchBrowser("chrome");
		get("https://www.target.com/");
	}
	
	@After
	public static void tearDown()
	{
		System.out.println("After Scenario");
		
	}
	
	
	
	

}
