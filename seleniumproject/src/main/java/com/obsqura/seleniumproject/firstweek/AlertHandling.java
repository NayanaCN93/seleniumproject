package com.obsqura.seleniumproject.firstweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends BrowserInitialisation1 {
	public void alerts() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickme1=driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]"));
		clickme1.click();
		driver.switchTo().alert().accept();
	}
	public void alert2() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickme2=driver.findElement(By.xpath("//button[@class=\"btn btn-warning\"]"));
		clickme2.click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}
	public void alert3() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickme3=driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));
		clickme3.click();
		driver.switchTo().alert().sendKeys("Nayana");
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
AlertHandling handlealert=new AlertHandling();
handlealert.browserInitialisation();
handlealert.alerts();
handlealert.alert2();
handlealert.alert3();

	}

}
