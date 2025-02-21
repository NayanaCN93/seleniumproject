package com.obsqura.seleniumproject.firstweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputForm extends BrowserInitialisation1 {
	public void inputMesaage() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagefeild=driver.findElement(By.id("single-input-field"));
		messagefeild.sendKeys("Hello");
		WebElement sendmessagebutton=driver.findElement(By.id("button-one"));
		sendmessagebutton.click();
		
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputForm ipform=new InputForm();
		ipform.browserInitialisation();
		ipform.inputMesaage();
	}

}
