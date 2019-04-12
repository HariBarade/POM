package com.sampleproject.TestCase;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sampleproject.Base.Testmain;
import com.sampleproject.Page.homepage;
import com.sampleproject.Page.loginpage;

// control + shift + O - import quickly

public class homepagetestcase extends Testmain {
	
	loginpage LoginPageCRM;
	homepage Homepage;

	
	public homepagetestcase() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		intBrowser();
		LoginPageCRM = new loginpage();
		Homepage = LoginPageCRM.loginwithexistinguser(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	// First test case - Verify home page
	@Test
	public void validatehomepagetitle() {
		String HPageTitle = Homepage.verifyHomeTitle();
		System.out.println(HPageTitle);
	}
	
	@AfterMethod
	public void homepagequite() {
		driver.quit();	

}
}
