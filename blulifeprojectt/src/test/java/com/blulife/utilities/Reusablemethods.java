package com.blulife.utilities;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;


import com.google.common.io.Files;
public class Reusablemethods {
	WebDriver driver;
    public Reusablemethods(WebDriver driver) {
        this.driver=driver;
         PageFactory.initElements(driver,this);
    }
    public void type(WebElement ele,String text) {
		ele.clear();
		ele.sendKeys(text);	
	}
	public void click(WebElement ele) {
		ele.click();
	}
	public void scrollByVisibilityOfElement(WebDriver driver,WebElement ele) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",ele );
		
	}
	public void actionClick(WebDriver driver,WebElement ele) {
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().build().perform();
	}
	public void rightClick(WebDriver driver,WebElement ele) {
		Actions act=new Actions(driver);
		act.moveToElement(ele).contextClick().build().perform();
	}
	public void mouseOver(WebDriver driver,WebElement ele) {
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
	}
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions act=new Actions(driver);
		act.moveToElement(ele).doubleClick().build().perform();
	}
	public boolean display(WebDriver driver,WebElement ele) {
		boolean displayed = ele.isDisplayed();
		return displayed;
	}
	
	public boolean select(WebDriver driver,WebElement ele) {
		boolean selected = ele.isSelected();
		return selected;
	}
	public boolean enable(WebDriver driver,WebElement ele) {
		boolean enabled = ele.isEnabled();
		return enabled;
	}
	public boolean selectByIndex(WebElement ele,int index) {
		boolean flag=false;
		try {
			Select s = new Select(ele);
			s.selectByIndex(index);
			flag = true;
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		} finally {
			if(flag) {
				System.out.println("Option selected by Index");
			} else {
				System.out.println("Option not selected by Index");
			}
		}
	}
	
	
	public boolean selectByValue(WebElement ele,String value) {
		boolean flag=false;
		try {
			Select s = new Select(ele);
			s.selectByValue(value);
			flag = true;
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		} finally {
			if(flag) {
				System.out.println("Option selected by value");
			} else {
				System.out.println("Option not selected by value");
			}
		}
	}
	
	public boolean selectByVisibleText(WebElement ele,String visibleText) {
		boolean flag=false;
		try {
			Select s = new Select(ele);
			s.selectByVisibleText(visibleText);
			flag = true;
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		} finally {
			if(flag) {
				System.out.println("Option selected by VisibleText");
			} else {
				System.out.println("Option not selected by VisibleText");
			}
		}
	}
	
	public boolean switchToFrameByIndex(WebDriver driver,int index) {
		boolean flag=false;
		try {
			driver.switchTo().frame(index);
			flag =true;
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally {
			if(flag) {
				System.out.println("Frame with index \""+index+"\"is selected");
			}else {
				System.out.println("Frame with index \""+index+"\"is not selecte");
			}
		}
		
		
	}
	
	public boolean switchToFrameById(WebDriver driver,String idvalue) {
		boolean flag=false;
		try {
			driver.switchTo().frame(idvalue);
			flag =true;
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally {
			if(flag) {
				System.out.println("Frame with idvalue \""+idvalue+"\"is selected");
			}else {
				System.out.println("Frame with idvalue \""+idvalue+"\"is not selecte");
			}
		}
		
		
	}
	
	public boolean switchToFrameByName(WebDriver driver,String name) {
		boolean flag=false;
		try {
			driver.switchTo().frame(name);
			flag =true;
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally {
			if(flag) {
				System.out.println("Frame with name \""+name+"\"is selected");
			}else {
				System.out.println("Frame with name \""+name+"\"is not selecte");
			}
		}
		
		
	}
	
	public boolean switchToDefaultFrame(WebDriver driver) {
		boolean flag=false;
		try {
			driver.switchTo().defaultContent();
			flag =true;
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally {
			if(flag) {
				System.out.println(" switched to default frame");
			}else {
				System.out.println("Not switched to deafult frame");
			}
		}
		
		
	}
	public boolean launchURL(WebDriver driver, String url) {
		boolean flag=false;
		try {
			driver.navigate().to(url);
			flag=true;
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return false;
		}finally {
			if(flag) {
				System.out.println("Successfully launched \""+url+"\"");
				
			}else {
				System.out.println("Failed to launch\""+url+"\"");
			}
		}
		
	}
	public String getTitle(WebDriver driver) {
		String title = driver.getTitle();
		return title;
	}
	public void implicityWait(int timeOut) {
		driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		
	}

 public void pageLoadTimeOut(WebDriver driver,int timeOut) {
	 driver.manage().timeouts().pageLoadTimeout(timeOut, TimeUnit.SECONDS);
 }
 public String screenShot(WebDriver driver,String fileName) throws IOException {
	 String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	 TakesScreenshot ts= (TakesScreenshot)driver;
	 File source = ts.getScreenshotAs(OutputType.FILE);
	 String destination="./screenShots//"+ fileName + "_" + dateName +".png";
	 Files.copy(source, new File(destination));
	 String newImageString = "http://localhost:8082/job/MyStoreProject/ws/MyStoreProject/ScreenShots/" + fileName + "_"
				+ dateName + ".png";
		return newImageString;
 }
 
}



