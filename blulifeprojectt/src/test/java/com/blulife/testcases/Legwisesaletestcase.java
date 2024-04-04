package com.blulife.testcases;

import org.testng.annotations.Test;

import com.blulife.pageobjects.Legwisesales;
import com.blulife.pageobjects.LoginPageElements;
import com.blulife.utilities.Reusablemethods;

public class Legwisesaletestcase extends Baseclass {
	@Test
	public void Legwisesaletestcase() throws InterruptedException
	{
		test = extent.createTest("LEGWISE SALE TESTCASE").assignCategory("Functional Test").assignAuthor("SUBBU");
	LoginPageElements db = new LoginPageElements(driver);
	Reusablemethods re = new Reusablemethods(driver);
	re.implicityWait(10);
	db.loginus(username);
	db.loginpwd(Pwd);
	db.clickSignin();
	
	Legwisesales ls=new Legwisesales(driver);
	ls.reportmenuls();
	
	ls.legwisesales();
	
	ls.fromdate();
	
	ls.todate();
	ls.legwisesalesearch();
	

	}
}
