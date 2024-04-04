package com.blulife.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickOrderPageElements {
	WebDriver driver;

	public QuickOrderPageElements(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "//*[@class='sidebar-header ng-star-inserted']//following::span[text()='Quick Order']")
	WebElement Quickorder;
	@FindBy(xpath = "(//button[text()=' ADD '])[4]")
	WebElement add;
	@FindBy(xpath = "//button[text()='Procced']")
	WebElement proccedbutton;
	
	public void quickorder()
	{
		Quickorder.click();	
	}
	public void clickonADDbutton()
	{
		add.click();
	}
	
	public void proccedbutton() throws InterruptedException
	{
		Actions ac = new Actions(driver);
		ac.click(proccedbutton).build().perform();
	}

}
