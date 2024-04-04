package com.blulife.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;




public class Wallet {
	WebDriver driver;

	public Wallet(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "(//*[@class='sidebar-header ng-star-inserted'])[6]")
	WebElement wallet;
	@FindBy(xpath = "(//*[@class='ng-star-inserted'])[44]")
	WebElement walletreq;
	@FindBy(xpath = "//button[text()=' Wallet Request']")
	WebElement walletreq1;
	@FindBy(xpath = "(//*[@class='form-control ng-untouched ng-pristine ng-invalid'])[1]")
	WebElement walletamount;
	@FindBy(xpath = "//*[@placeholder='Reference No']")
	WebElement walletreferance;
	@FindBy(xpath = "//*[@formcontrolname='transactionsource']")
	WebElement TransferSource;
	@FindBy(xpath = "//*[@formcontrolname='trasnferdate']")
	WebElement Transferdate;
	@FindBy(xpath = "(//*[@class='btn btn-solid btn-xs'])[1]")
	WebElement ReferenceAttachment;
	@FindBy(xpath = "//*[text()='Submit']")
	WebElement submit;
	@FindBy(xpath = "//*[@class='swal2-confirm swal2-styled']")
	WebElement ok;
	
	
	
	
	
	
	public void wallet()
	{
		wallet.click();
	}
	public void walletreq()
	{
		walletreq.click();
	}
	public void walletreq1()
	{
		walletreq1.click();
	}
	public void walletamount1(String amount)
	{
		walletamount.sendKeys(amount);
	}
	public void walletref(String ref)
	{
		walletreferance.sendKeys(ref);
	}
	public void walletbank()
	{
		TransferSource.click();
		Select pay1=new Select(TransferSource);
		pay1.selectByValue("Paytm");
	}
	public void transferDate() {
		Transferdate.sendKeys("01-11-1998");
	}
	public void ReferenceAttachment() throws InterruptedException, AWTException
	{
		ReferenceAttachment.click();
		Robot robot = new Robot();
		Thread.sleep(2000);
		File file = new File("C:\\Users\\vt21424\\Desktop\\New folder\\blulife12.png");
		StringSelection stringSelection = new StringSelection(file.getAbsolutePath());
 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
 
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
 
		
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}
	public void submit()
	{
		submit.click();
		
	}
	public void okalert()
	{
		ok.click();
		
	}
	
	

}
