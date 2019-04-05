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
	
	//Initializing the object 
	
	public homepage() {
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	public String verifyhometitlename() {
		return driver.getTitle();
	}
	
	public void clickoncontactlink() {
		ContactLink.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
