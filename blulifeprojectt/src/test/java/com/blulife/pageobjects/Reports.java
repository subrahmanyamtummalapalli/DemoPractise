package com.blulife.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reports {
	WebDriver driver;

	public Reports( WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[text()='Reports']") 
	WebElement ClickReportmenu;
	@FindBy(xpath="(//a[contains(@class,'ng-star-inserted')]/following::span)[10]")
	WebElement clickorder;
	@FindBy(xpath = "(//input[contains(@class,'form-control ng-untouched ng-pristine ng-valid')])[1]")
	WebElement orderfromdate;
	@FindBy(xpath = "//*[contains(@placeholder,'To Date')]")
	WebElement orderTodate;
	@FindBy(xpath = "//*[text()='Search']")
	WebElement search;
	public void reportmenu()
	{
		ClickReportmenu.click();
	}
	public void reportmenuinorder()
	{
		clickorder.click();
	}
	public void myorderfromdate()
	{
		orderfromdate.sendKeys("01-04-2024");
		
	}
	public void myorderTodate()
	{
		orderTodate.sendKeys("02-04-2024");
		
	}
	public void search()
	{
		search.click();
	}

}
