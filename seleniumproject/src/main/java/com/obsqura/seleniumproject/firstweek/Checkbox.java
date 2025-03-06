package com.obsqura.seleniumproject.firstweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox extends BrowserInitialisation1{
	public void check() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");//navigate to input form
		WebElement checkbox=driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));//select check box link
		
		checkbox.click();//click check box link
		WebElement clickfeild =driver.findElement(By.xpath("//input[@id='gridCheck']"));//select click on this check box field
		clickfeild.click();//click the  click on this check box field
		System.out.println(clickfeild.isSelected());
		
		
	}
public void radiobutton() {
	driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	WebElement radiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
	radiobutton.click();
	System.out.println(radiobutton.isSelected());
	WebElement radiobutton1=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
	radiobutton1.click();
	System.out.println(radiobutton1.isSelected());
	
}
	

public static void main(String[] args) {
	
	Checkbox box=new Checkbox();
	box.browserInitialisation();
	box.check();
	//box.radiobutton();
}}