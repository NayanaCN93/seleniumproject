package com.obsqura.seleniumproject.firstweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns extends BrowserInitialisation1{
	public void dropdowns() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selectfromdropdown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(selectfromdropdown);
		//select.selectByVisibleText("Red");
		//select.selectByValue("Yellow");
		select.selectByIndex(3);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HandlingDropdowns dropdown=new HandlingDropdowns();
dropdown.browserInitialisation();
dropdown.dropdowns();
	}

}
