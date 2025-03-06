package com.obsqura.seleniumproject.firstweek;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadEg {
WebDriver driver;
public void uploadfile() {
	driver=new ChromeDriver();
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	driver.manage().window().maximize();
	WebElement clickfileupload=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
	clickfileupload.click();
	clickfileupload.sendKeys("\"C:\\Users\\nayan\\OneDrive\\Documents\\excel read (1).pdf\"");
}
public void fileuploadrobot() throws AWTException {
	driver=new ChromeDriver();
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	driver.manage().window().maximize();
	WebElement clickfileupload=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
	clickfileupload.click();
	StringSelection selection=new StringSelection("\"C:\\Users\\nayan\\OneDrive\\Documents\\excel read (1).pdf\"");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
	Robot robo=new Robot();
	robo.delay(2000);
	robo.keyPress(KeyEvent.VK_CONTROL);
	robo.keyPress(KeyEvent.VK_V);
	robo.keyRelease(KeyEvent.VK_CONTROL);
	robo.keyRelease(KeyEvent.VK_V);
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	robo.delay(2000);
	
}
public void converttoword() {
	
WebElement convert=driver.findElement(By.xpath("//button[@id='processTask']"));

convert.click();
	
}

	public static void main(String[] args)throws AWTException {
		// TODO Auto-generated method stub
FileuploadEg file=new FileuploadEg();
//file.uploadfile();
file.fileuploadrobot();
file.converttoword();
	}

}
