package com.qa.bigC;

import org.testng.annotations.Test;

public class TC_bigC_02 extends TestBase {

	@Test(priority=1)
	public void login()
	{
		Objects.getLogin().click();
		Objects.getEmail().sendKeys("nikithadugya@gmail.com");
		Objects.getPassword().sendKeys("123");
		Objects.getSignin().click();
		
		
	}
}