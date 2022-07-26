package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	WebDriver driver;
	Signin(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver2,this);
	}
	@FindBy(xpath="//input[@id='username']")
	WebElement username;

	@FindBy(xpath="//button[.='SIGN IN']")
	WebElement signinbutton1;
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	@FindBy(xpath="//label[@for='remember-me']")
	WebElement checkbox;
	@FindBy(xpath="//a[.='Log In']")
	WebElement login;
	void uname(String uname)
	{
		username.sendKeys(uname);
	}
	public void signinbutton()
	{
		signinbutton1.click();
	}
	void password(String pwd)
	{
		password.sendKeys(pwd);
	}
	void chbox()
	{
		checkbox.click();
		System.out.println(checkbox.isSelected());
	}
	void login()
	{
		login.click();
	}
}
