package Pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Order {
	WebDriver driver;
	@FindBy(xpath="//div[@id='navbarSupportedContent']/ul/li[4]")
	WebElement support;
	@FindBy(xpath="//a[.='Order']")
	WebElement orderdrop;
	@FindBy(id="inputFirstName")
	WebElement firstname;
	@FindBy(xpath="(//input[@id=\"inputFirstName\"])[2]")
	WebElement lastname;
	@FindBy(id="inputEmail")
	WebElement email;
	@FindBy(id="inputPassword")
	WebElement password;
	@FindBy(id="flexRadioDefault1")
	WebElement gender;
	@FindBy(xpath="//input[@min='0']")
	WebElement phnumb;
	@FindBy(xpath="//input[@id=' address1']")
	WebElement address1;
	@FindBy(xpath="//input[@id='address2']")
	WebElement address2;
	@FindBy(xpath="//input[@id='inputCity']")
	WebElement inputcity;
	@FindBy(xpath="//select[@id='inputState']")
	WebElement dropdown;
	@FindBy(xpath="//input[@id='inputZip']")
	WebElement inputzip;
	@FindBy(xpath="//input[@rel='apple']")
	WebElement apple;
	@FindBy(xpath="//input[@rel='samsung']")
	WebElement samsung;
	@FindBy(xpath="//option[.='Apple 12']")
	WebElement samsung12;
	@FindBy(xpath="//input[@placeholder='no of mobiles']")
	WebElement number;
	@FindBy(xpath="//select[@id='bought']")
	WebElement bought;
	@FindBy(xpath="(//input[@id='gridCheck1'])[1]")
	WebElement addresscorrect;
	@FindBy(xpath="(//input[@id='gridCheck1'])[2]")
	WebElement numbercorrect;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement orderbutton;
	@FindBy(xpath="//div[@class='modal-body']")
	WebElement text;
	@FindBy(xpath="//a[.='Close']")
	WebElement close;
	Order(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver2,this);
	}

	public void support()
	{
		support.click();
		orderdrop.click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parent_Id = it.next();
		String child_Id = it.next();
		driver.switchTo().window(child_Id);
	}
	public void firstname(String fname)
	{
		firstname.sendKeys(fname);
	}
	public void lastname(String lname)
	{
		lastname.sendKeys(lname);
	}
	public void email(String EMAIL)
	{
		email.sendKeys(EMAIL);
	}
	public void password(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void male()
	{
		gender.click();
		System.out.println(gender.isSelected());
	}
	public void phnumber(String pnum)
	{
		phnumb.sendKeys(pnum);
	}
	public void adrees1(String add1)
	{
		address1.sendKeys(add1);
	}
	public void adrees2(String add2)
	{
		address2.sendKeys(add2);
	}
	public void inputcity(String city)
	{
		inputcity.sendKeys(city);
	}
	public void inputstate()
	{
		Select drop=new Select(dropdown);
		drop.selectByIndex(2);
	}
	public void inputzip(String zip)
	{
		inputzip.sendKeys(zip);
	}
	public void checkbox()
	{
		apple.click();
		System.out.println(apple.isSelected());
		samsung.click();
		System.out.println(samsung.isSelected());
		samsung12.click();
		System.out.println(samsung12.isSelected());
	}
	public void no_of_mob(String num)
	{
		number.sendKeys(num);
	}
	public void bought()
	{
		Select drop1=new Select(bought);
		drop1.selectByIndex(1);
	}
	public void correct()
	{
		addresscorrect.click();
		System.out.println(addresscorrect.isSelected());
		numbercorrect.click();
		System.out.println(numbercorrect.isSelected());
	}
	public void order()
	{
		orderbutton.click();
	}
	public void text()
	{
		System.out.println(text.getText());
	}
	public void close1()
	{
		close.click();
	}
}
