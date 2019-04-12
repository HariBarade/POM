package com.sampleproject.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sampleproject.Base.Testmain;

public class homepage extends Testmain {
	
	// Object rep of Homepage
	
	@FindBy(xpath= "html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]")
	 WebElement HomepageTitle;
	
	
	@FindBy(xpath ="//a[contains(text(),'Contacts')]")
	WebElement ContactLink;
	
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement DealLink;
	
	@FindBy(xpath = "//a[contains(text(),'Task')]")
	WebElement Task;
	
	
	//Initializing the object 
	
	public homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public String Verifmainhomepage() {
		return driver.getTitle();
	}
	
	public contactpage Clickoncontact() {
		ContactLink.click();
		 return new contactpage();
	}
	
	public dealspage Clickondeal() {
		DealLink.click();
		 return new dealspage();
	}
	
	//methods
	
	public  String verifyHomeTitle() {
		return driver.getTitle();
	}
	
	public void clickoncontactlink() {
		ContactLink.click();
	}
	

}
