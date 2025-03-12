package com.obsqura.seleniumproject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptexcecuterEg {
	WebDriver driver;
  @Test
  public void scroljavascriptexcecuter() {
	  driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  JavascriptExecutor executor=(JavascriptExecutor) driver;
	  executor.executeScript("window.scrollBy(0, 1000)");
	  executor.executeScript("window.scrollBy(0,-500)");
	  
  }
}
