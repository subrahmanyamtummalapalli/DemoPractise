package com.blulife.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {

	WebDriver driver;

	public LoginPageElements( WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='User Name']") 
	WebElement loginus;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement loginpwd;
	@FindBy(xpath = "//button[contains(@class,'btn-sign')]")
	WebElement loginsigin;

	public void loginus(String username) {
		loginus.sendKeys(username);

	}

	public void loginpwd(String pwd) {
		loginpwd.sendKeys(pwd);
	}

	public void clickSignin() {
		loginsigin.click();
	}
}
