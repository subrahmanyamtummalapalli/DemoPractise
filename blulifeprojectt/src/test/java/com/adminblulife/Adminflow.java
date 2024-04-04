package com.adminblulife;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.blulife.testcases.Baseclass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adminflow extends Baseclass {
	public static WebDriver driver;
	@Test
	
	public static void adminflow() throws InterruptedException{
		test = extent.createTest("AdminTestcase").assignCategory("Functional Test").assignAuthor("subbu");
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://admin.bltestapp.in/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[placeholder=\"Username\"]")).sendKeys("admin");
		driver.findElement(By.cssSelector("[placeholder=\"Password\"]")).sendKeys("Blulife#2024");
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		driver.findElement(By.xpath("//*[text()='Wallet']")).click();
		driver.findElement(By.xpath("//*[text()='Wallet Requests']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Open'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[placeholder=\"Remarks\"]")).sendKeys("approved");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Approve Request')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();	
	}

}
