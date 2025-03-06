package com.obsqura.seleniumproject.firstweek;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewtabEg {
WebDriver driver;
public void getNewtabrobot() throws AWTException {
	driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/index.php");
	driver.manage().window().maximize();
	Robot robo=new Robot();
	robo.delay(2000);
	robo.keyPress(KeyEvent.VK_CONTROL);//to press control
	robo.keyPress(KeyEvent.VK_T);//to press t for new tab
	robo.keyRelease(KeyEvent.VK_CONTROL);//to release control
	robo.keyRelease(KeyEvent.VK_T);//to release t

}

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		NewtabEg tab=new NewtabEg();
		tab.getNewtabrobot();

	}

}
