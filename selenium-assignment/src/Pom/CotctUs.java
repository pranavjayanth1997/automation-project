package Pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CotctUs {
	WebDriver driver;

	@FindBy(xpath="//div[@id='navbarSupportedContent']/ul/li[4]")
	WebElement support;
	@FindBy(xpath="//a[.='Contact Us']")
	WebElement contact_us;
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement email;
	@FindBy(xpath="//input[@placeholder='Phone']")
	WebElement phone;
	@FindBy(name="message")
	WebElement message;
	@FindBy(xpath="//input[@class='btn']")
	WebElement submit;


	CotctUs(WebDriver driver3) {
		driver = driver3;
		PageFactory.initElements(driver3,this);
	}
	public void support()
	{
		support.click();
	}
	public void contact_us()
	{
		contact_us.click();
	}
	public void username(String uname)
	{
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		username.sendKeys(uname);
	}
	public void email(String emailid)
	{
		email.sendKeys(emailid);
	}
	public void phone(String phnum) throws InterruptedException
	{
		phone.sendKeys(phnum);
		Thread.sleep(5000);
	}
	public void message(String msg) throws InterruptedException
	{
		message.sendKeys(msg);
		Thread.sleep(5000);
	}
	public void submit() throws InterruptedException
	{
		submit.click();
		Thread.sleep(5000);
	}
}

