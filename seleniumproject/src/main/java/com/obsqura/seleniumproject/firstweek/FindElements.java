package com.obsqura.seleniumproject.firstweek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements extends BrowserInitialisation1{
	public void multipleelements() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> multiplecheckbox= driver.findElements(By.xpath("//input[@class='check-box-list']"));//converted to list
		for(WebElement boxes:multiplecheckbox) {
			boxes.click();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FindElements element=new FindElements();
element.browserInitialisation();
element.multipleelements();

	}

}
