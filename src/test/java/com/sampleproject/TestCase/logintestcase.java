package com.sampleproject.TestCase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sampleproject.Base.Testmain;
import com.sampleproject.Page.homepage;
import com.sampleproject.Page.loginpage;

public class logintestcase extends Testmain {

	 loginpage LoginPageCRM;
	 homepage Homepage;
	
	public logintestcase() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		intBrowser();
		LoginPageCRM = new loginpage();
	}
	
	@Test
	public void validateloginofFreeCRM() {
		String title = LoginPageCRM.validateloginofFreeCRM();
		Assert.assertEquals(title, "CRMPRO Log In Screen");
	}
	

	@Test
	public void logindetails() {
		Homepage = LoginPageCRM.loginwithexistinguser(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void test2() {
		driver.close();
		
}


	
	
	
	
	
	
	
}
