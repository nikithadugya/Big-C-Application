package com.qa.bigC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

public class TestBase {
	WebDriver driver;
	public PagesbigC Objects;
	SoftAssert SAssert;
	@Parameters({"Browser","Url"})
	
	@BeforeClass
	public void setUp(String Browser,String Url)
	{
		if(Browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\driver\\chromedriver.exe");
			driver =new ChromeDriver();
		}
	Objects= new PagesbigC(driver);
    driver.get(Url);
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}











//span[@id='nav-link-accountList-nav-line-1']