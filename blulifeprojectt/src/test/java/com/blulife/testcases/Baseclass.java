package com.blulife.testcases;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.blulife.utilities.Readconfig;





public class Baseclass {
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentHtmlReporter html;
	 
	Readconfig rc = new Readconfig();
	String url = rc.getapplicationurl();
	String username = rc.getusername();
	String Pwd = rc.getpassword();
	
	@BeforeSuite
	public void reportGenerate()
	{
		extent = new ExtentReports();
		html = new ExtentHtmlReporter("./reports/" + "extentReports.html");
		extent.attachReporter(html);
	}

	@BeforeMethod
	public void launchbrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void logResult(ITestResult result)
	{
		
		
		if(result.getStatus() == ITestResult.SUCCESS)
		{
			test.pass(result.getThrowable().getMessage());
		}
		else if(result.getStatus() == ITestResult.SKIP)
		{
			test.skip(result.getThrowable().getMessage());
		}
		
		else if(result.getStatus() == ITestResult.FAILURE)
		{
			test.fail(result.getThrowable().getMessage());
		}
		
		
		//driver.close();
	}
	
	
	
	@AfterSuite
	public void tearDown()
	{
		extent.flush();
	}
	
}
	
		
		



