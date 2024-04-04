package com.blulife.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.blulife.pageobjects.LoginPageElements;
import com.blulife.pageobjects.QuickOrderPageElements;
import com.blulife.pageobjects.Wallet;
import com.blulife.utilities.Readconfig;
import com.blulife.utilities.Reusablemethods;

public class Logintestcase extends Baseclass {

	@Test

	public void validLogin() throws InterruptedException {
		test = extent.createTest("Quick Order").assignCategory("Functional Test").assignAuthor("Vinay");
		Reusablemethods re = new Reusablemethods(driver);
		QuickOrderPageElements qop = new QuickOrderPageElements(driver);
		LoginPageElements db = new LoginPageElements(driver);
		Wallet walletreq=new Wallet(driver);
		Readconfig rf=new Readconfig();
		re.implicityWait(10);
		db.loginus(username);
		db.loginpwd(Pwd);
		db.clickSignin();
		Thread.sleep(3000);
		test.pass("Login Success");
		qop.quickorder();
		Thread.sleep(3000);
		qop.clickonADDbutton();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement button = driver.findElement(By.xpath("//button[text()='Procced']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);
		// qop.proccedbutton();
		driver.findElement(By.xpath("//*[@id='Purchase Wallet']")).click();
		Thread.sleep(3000);

		WebElement netAmountElement = driver.findElement(By.xpath("//div[text()='Net Amount :']/following-sibling::div"));
		String value = netAmountElement.getText();
		WebElement textFieldElement = driver.findElement(By.xpath("(//input[@placeholder='Enter Amount'])[1]"));
		textFieldElement.clear();
		textFieldElement.sendKeys(value);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[1]"))
		.sendKeys(rf.getpassword());
		WebElement placeorder = driver.findElement(By.xpath("//*[text()='Place Order']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", placeorder);
		
	}


}
