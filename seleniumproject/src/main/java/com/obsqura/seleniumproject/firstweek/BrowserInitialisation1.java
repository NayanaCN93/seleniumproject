package com.obsqura.seleniumproject.firstweek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInitialisation1 {
	public WebDriver driver;
	public void browserInitialisation() {
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
		
	}
public void quitAndClose() {
	driver.quit();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BrowserInitialisation1 browser= new BrowserInitialisation1();
browser.browserInitialisation();
browser.quitAndClose();
	}

}
