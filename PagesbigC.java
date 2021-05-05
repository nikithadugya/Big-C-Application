package com.qa.bigC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagesbigC {
	public WebDriver driver;
		
	    @FindBy(linkText="Login")
	    WebElement Login;
	    
	    public WebElement getLogin()
	    {
	    	return Login;
	    }
	    
	    @FindBy(xpath="//*[@id=\"email\"]")
	    WebElement email;
	    
	    public WebElement getEmail()
	    {
	    	return email;
	    }
	  
	    
	    @FindBy(xpath="//*[@id=\"pass\"]")
	    WebElement password;
	    
	    public WebElement getPassword()
	    {
	    	return password;
	    }
	    
	    @FindBy(xpath="//*[@id=\"send2\"]/span")
	    WebElement signin;
	    
	    public WebElement getSignin()
	    {
	    	return signin;
	    }
	    
	    
	    public PagesbigC(WebDriver driver)
	    {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
	    
	    @FindBy(xpath="//*[@id=\"search\"]")
	    WebElement SearchBox;
	    public WebElement getSearchBox()
	    {
	    	return SearchBox;
	    			
	    }
	    
	    @FindBy(xpath="1")
	    WebElement submitBox;
	    public WebElement submitBox()
	    {
	    	return submitBox;
	    			
	    }
}