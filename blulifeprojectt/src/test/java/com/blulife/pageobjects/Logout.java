package com.blulife.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	WebDriver driver;

	public Logout( WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[contains(@class,'sidebar-header ng-star-inserted')])[11]") 
	WebElement logout;
	
	
	public void Logout1()
	{
		logout.click();
	}

}
