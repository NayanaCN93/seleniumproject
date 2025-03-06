package com.obsqura.seleniumproject.firstweek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputHello extends BrowserInitialisation1 {

	
	public void helloInThree(){
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> text=driver.findElements(By.xpath("//input[@class='form-control']"));
		for(WebElement entervalue:text) {
			entervalue.sendKeys("Hello");
		}
		
		
		
	}
	public static void main(String[] args) {
		InputHello input=new InputHello();
		input.browserInitialisation();
		input.helloInThree();
		
	}
}