package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBys(@FindBy(id="username"))
	private WebElement userName;
	
	@FindBys(@FindBy(id="password"))
	private WebElement passWord;
	
	@FindBy(id="login")
	private WebElement loginBtn;

	@FindBy(xpath="//span[text()='Sign in']")
	private WebElement accountSignIn;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement signInBtn;
	
	
	public WebElement getAccountSignIn() {
		return accountSignIn;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
