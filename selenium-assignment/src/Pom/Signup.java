package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
	WebDriver driver;
	@FindBy(xpath="//button[.='SIGN IN']")
	WebElement signinbutton1;

	@FindBy(xpath="//a[.='Sign up']")
	WebElement signupbutton;

	@FindBy(xpath="//input[@id='myName']")
	WebElement firstname;

	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lastname;

	@FindBy(xpath="//input[@placeholder='Enter Email']")
	WebElement email;

	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;

	@FindBy(xpath="//input[@type='date']")
	WebElement date;

	@FindBy(xpath="/html/body/div/div[2]/form/div[3]/div[3]/input")
	WebElement male;

	@FindBy(xpath="//input[@placeholder='91XXXXXXXXXX']")
	WebElement phnumber;

	@FindBy(xpath="//textarea[@placeholder='Short Bio']")
	WebElement bio;

	@FindBy(xpath="//button[.='Sign In']")
	WebElement register;

	Signup(WebDriver driver1) {
		driver=driver1;
		PageFactory.initElements(driver,this);
	}
	public void signinbutton()
	{
		signinbutton1.click();
	}
	public void signupbutton()
	{
		signupbutton.click();
	}
	public void fname(String fname)
	{
		firstname.sendKeys(fname);
	}
	public void lname(String lname)
	{
		lastname.sendKeys(lname);
	}
	public void email(String email1)
	{
		email.sendKeys(email1);
	}
	public void password(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void date()
	{
		date.click();
	}
	public void radio()
	{
		male.click();
		System.out.println(male.isSelected());
	}
	public void phone(String phnum)
	{
		phnumber.sendKeys(phnum);
	}
	public void bio(String addbio)
	{
		bio.sendKeys(addbio);
	}
	public void register()
	{
		register.click();
		driver.switchTo().alert().accept();
	}
}
