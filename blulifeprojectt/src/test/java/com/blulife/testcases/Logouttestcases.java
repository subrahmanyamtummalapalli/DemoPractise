package com.blulife.testcases;

import org.testng.annotations.Test;

import com.blulife.pageobjects.LoginPageElements;
import com.blulife.utilities.Reusablemethods;

public class Logouttestcases extends Baseclass{
	@Test
	public void Logout()
	{
		test = extent.createTest("Logout").assignCategory("Functional Test").assignAuthor("SUBBU");
		LoginPageElements db = new LoginPageElements(driver);
		Reusablemethods re = new Reusablemethods(driver);
		
		re.implicityWait(10);
		db.loginus(username);
		db.loginpwd(Pwd);
		db.clickSignin();
		//Logout logout=new Logout(driver);
				
		
	}

}
