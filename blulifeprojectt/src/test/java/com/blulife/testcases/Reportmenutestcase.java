package com.blulife.testcases;

import org.testng.annotations.Test;

import com.blulife.pageobjects.LoginPageElements;
import com.blulife.pageobjects.Reports;
import com.blulife.utilities.Readconfig;
import com.blulife.utilities.Reusablemethods;

public class Reportmenutestcase extends Baseclass{
	@Test
	public void Reportmenutestcase() throws InterruptedException
	{
		test = extent.createTest("ReportMenuTestcase").assignCategory("Functional Test").assignAuthor("subbu");
		LoginPageElements db = new LoginPageElements(driver);
		Reusablemethods re = new Reusablemethods(driver);
		Readconfig rf=new Readconfig();
		re.implicityWait(100);
		
		db.loginus(username);
		db.loginpwd(Pwd);
		db.clickSignin();
		Reports report=new Reports(driver);
		report.reportmenu();
		Thread.sleep(2000);
		report.reportmenuinorder();
		Thread.sleep(2000);
		report.myorderfromdate();
		
		report.myorderTodate();
		Thread.sleep(2000);
		report.search();
		
		
		
	}

}
