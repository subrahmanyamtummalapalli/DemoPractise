package com.blulife.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.blulife.utilities.Reusablemethods;

public class Legwisesales {
	WebDriver driver;

	public Legwisesales( WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "(//a[contains(@class,'sidebar-header ng-star-inserted')]//following::span)[9]") 
	WebElement ClickReportmenu1;
	@FindBy(xpath="//*[text()='Legwise Sales']")
	WebElement legwisesale;
	@FindBy(xpath="//*[@placeholder='From Date']")
	WebElement Fromdate;
	@FindBy(xpath="//input[@placeholder='To Date']")
	WebElement Todate;
	@FindBy(xpath="//button[text()='Search']")
	WebElement lwssearch;
	public void reportmenuls()
	{
		ClickReportmenu1.click();
	}
	public void legwisesales()
	{
		legwisesale.click();
	}
	public void fromdate()
	{
		Fromdate.sendKeys("01-04-2024");
	}
	public void todate()
	{
		Todate.sendKeys("02-04-2024");
	}
	public void legwisesalesearch()
	{
		lwssearch.click();
	}
}
