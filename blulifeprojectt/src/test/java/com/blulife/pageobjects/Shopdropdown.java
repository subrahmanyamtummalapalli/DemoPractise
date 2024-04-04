package com.blulife.pageobjects;




import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shopdropdown {
	WebDriver driver;

	public Shopdropdown( WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[contains(text(),'Shop')]") 
	WebElement Clickshopbtn;
	@FindBy(xpath="(//*[@class='ng-star-inserted'])[57]")
	WebElement kidsdrop;
	
	@FindBy(xpath = "/html/body/app-root/app-public-content-layout/app-product/section/div/div/div[2]/div[2]/div/div/div/div[1]/div/div/div/div[2]/div[2]/button")
	WebElement add;
	@FindBy(xpath = "//*[@class='onhover-div mobile-cart']//img")
	WebElement cart;
	@FindBy(xpath = "//a[contains(text(),'check out')]")
	WebElement checkout;
	@FindBy(xpath="//*[@id='Purchase Wallet']")
	WebElement checkbox;
	
	public void shopdeopdown()
	{
		Clickshopbtn.click();
	}
	public void kidsdropdown()
	{
		kidsdrop.click();
	}
	public void addtocart()
	{
		add.click();
	}
	
	public void carticon()
	{
		
		cart.click();
	}
	public void checkoutbtn()
	{
		checkout.click();
	}
	public void checkbox()
	{
		checkbox.click();
	}
}
