package com.sampleproject.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testmain {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public  Testmain() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("E:/Hari/Hari/selenium/PageObjectModelProject/src/main/java/com"
			+ "/sampleproject/Util/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 	
		
	}
		
	public static void intBrowser(){
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Hari\\Hari\\selenium\\Eclipse\\Driver\\chromedriver_win32\\chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "E:\\Hari\\Hari\\selenium\\Eclipse\\Driver\\geckodriver-v0.16.1-win64");	
			driver = new FirefoxDriver(); 
		}		

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
}
}