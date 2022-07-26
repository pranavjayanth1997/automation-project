package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class All_mob {
WebDriver driver;
	
	@FindBy(xpath="//a[.='All Mobiles']")
	WebElement allmobiles;
	@FindBy(xpath="//input[@id='myInput']")
	WebElement textfield;
	@FindBy(xpath="//a[@class='btn btn-primary  waves-effect waves-light' and .='Order']")
	WebElement order;
	 All_mob(WebDriver driver2) {
		 driver=driver2;
		 PageFactory.initElements(driver2,this);	
	}
   public void allmobiles()
   {
	   allmobiles.click();
   }
   public void textfield(String tname)
   {
	   textfield.sendKeys(tname);
   }
   public void order()
   {
	   order.click();
   }  
}

