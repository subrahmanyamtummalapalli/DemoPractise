package com.blulife.testcases;



import org.testng.annotations.Test;

import com.blulife.pageobjects.LoginPageElements;
import com.blulife.pageobjects.QuickOrderPageElements;
import com.blulife.pageobjects.Wallet;
import com.blulife.utilities.Reusablemethods;
import com.github.javafaker.Faker;



public class WalletTestCase extends Baseclass{
	@Test
	public void wallet() throws InterruptedException, Exception
	{
		test = extent.createTest("WalletTest").assignCategory("Functional Test").assignAuthor("Subbu");
		Faker faker = new Faker();
		LoginPageElements db = new LoginPageElements(driver);
		QuickOrderPageElements qop = new QuickOrderPageElements(driver);
		Wallet walletreq=new Wallet(driver);
		Reusablemethods re = new Reusablemethods(driver);
		re.implicityWait(10);
		db.loginus(username);
		db.loginpwd(Pwd);
		db.clickSignin();
		test.pass("LoginSuccess");
		
		walletreq.wallet();
		
		walletreq.walletreq();
		
		test.pass("Wallet Page");
		walletreq.walletreq1();
		
		int amount = faker.number().numberBetween(1000, 10000);
		walletreq.walletamount1(String.valueOf(amount));
		
		int ref = faker.number().numberBetween(100, 10000);
		walletreq.walletref(String.valueOf(ref));
		
		walletreq.walletbank();
		
		walletreq.transferDate();
		
		walletreq.ReferenceAttachment();
	
		walletreq.submit();
	
		walletreq.okalert();
		//reuse.random();
		test.pass("Submit Successfully");
	}

}
