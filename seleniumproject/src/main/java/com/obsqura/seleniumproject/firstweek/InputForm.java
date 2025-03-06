package com.obsqura.seleniumproject.firstweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputForm extends BrowserInitialisation1 {
	public void inputMesaage() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagefeild=driver.findElement(By.id("single-input-field"));
		System.out.println(messagefeild.isEnabled());
		messagefeild.sendKeys("Hello");
		WebElement sendmessagebutton=driver.findElement(By.id("button-one"));
		sendmessagebutton.click();
		
		
	}
public void valueab() {
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement entervaluea=driver.findElement(By.id("value-a"));
	entervaluea.sendKeys("20");
	WebElement entervalueb=driver.findElement(By.id("value-b"));
	entervalueb.sendKeys("50");
	WebElement gettotalbutton=driver.findElement(By.id("button-two"));
	gettotalbutton.click();
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputForm ipform=new InputForm();
		ipform.browserInitialisation();
		ipform.inputMesaage();
		ipform.valueab();
	}

}
