package com.obsqura.seleniumproject.firstweek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://selenium.qabible.in/index.php");
driver.manage().window().maximize();
//driver.close();
driver.quit();

	}

}
