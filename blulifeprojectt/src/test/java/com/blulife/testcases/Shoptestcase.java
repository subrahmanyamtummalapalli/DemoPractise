package com.blulife.testcases;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

import com.blulife.pageobjects.LoginPageElements;
import com.blulife.pageobjects.Shopdropdown;
import com.blulife.utilities.Readconfig;
import com.blulife.utilities.Reusablemethods;

public class Shoptestcase extends Baseclass {
	@Test
	public void Shoptestcase() throws InterruptedException {
		test = extent.createTest("Shop Testcase").assignCategory("Functional Test").assignAuthor("subbu");
		LoginPageElements db = new LoginPageElements(driver);
		Reusablemethods re = new Reusablemethods(driver);
		Readconfig rf=new Readconfig();
		
		db.loginus(username);
		db.loginpwd(Pwd);
		db.clickSignin();
		Thread.sleep(2000);
		Shopdropdown sp = new Shopdropdown(driver);
		Thread.sleep(2000);
		sp.shopdeopdown();
		Thread.sleep(2000);
		sp.kidsdropdown();
		re.implicityWait(10);
		Thread.sleep(2000);
		WebElement addele = driver.findElement(By.xpath("(//*[contains(@class,'btn btn-primary btn-sm btn-big ng-star-inserted')])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", addele);
		System.out.println("successfully click the element");
		re.implicityWait(10);
		sp.carticon();
		re.implicityWait(10);
		WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'check out')]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView()", element1);
		Thread.sleep(2000);	
		sp.checkoutbtn();
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.xpath("//*[@id='Purchase Wallet']"));
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", element2);
		Thread.sleep(2000);
		WebElement netAmountElement = driver.findElement(By.xpath("//div[text()='Net Amount :']/following-sibling::div"));
		String value = netAmountElement.getText();
		WebElement textFieldElement = driver.findElement(By.xpath("(//input[@placeholder='Enter Amount'])[1]"));
		textFieldElement.clear();
		textFieldElement.sendKeys(value);
		Thread.sleep(3000);
		WebElement transpassword=driver.findElement(By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[1]"));
		
		transpassword.sendKeys(rf.getpassword());
		WebElement placeorder = driver.findElement(By.xpath("//*[text()='Place Order']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", placeorder);
		
			
		
		

	}
}
