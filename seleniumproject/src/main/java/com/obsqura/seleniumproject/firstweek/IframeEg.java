package com.obsqura.seleniumproject.firstweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg {
WebDriver driver;
public void iframeclick() {
	driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/guru99home/");
	driver.manage().window().maximize();
	WebElement iframe=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
	driver.switchTo().frame(iframe);
	WebElement jmeter=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	jmeter.click();
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
IframeEg frame=new IframeEg();
frame.iframeclick();
	}

}
