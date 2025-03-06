package com.obsqura.seleniumproject.firstweek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {
	public WebDriver driver;
	public void dropdowns() {
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
	}
	public void dropmenu1() {
		WebElement selectfromdropdown=driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select=new Select(selectfromdropdown);
		//select.selectByVisibleText("JAVA");
		//select.selectByValue("c#");
		//select.selectByIndex(2);
		select.selectByIndex(3);
	
	}
	public void dropmenu2() {
		WebElement selectdropdown=driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		Select select=new Select(selectdropdown);
		//select.selectByVisibleText("Eclipse");
		//select.selectByValue("maven");
		select.selectByIndex(2);
		select.selectByIndex(3);
		
		}
	public void dropmenu3() {
		WebElement selectdropdown=driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
		Select select=new Select(selectdropdown);
		select.selectByVisibleText("HTML");
		//select.selectByValue("css");
		//select.selectByIndex(2);
		//select.selectByIndex(3);
	}
	public void checkbox() {
		WebElement selectfromdropdown=driver.findElement(By.xpath("//div[@id='checkboxes']"));
		/*WebElement checkbox1=driver.findElement(By.xpath("//input[@value='option-1']"));
		checkbox1.click();
		WebElement checkbox2=driver.findElement(By.xpath("//input[@value='option-2']"));
		checkbox2.click();
		WebElement checkbox3=driver.findElement(By.xpath("//input[@value='option-3']"));
		checkbox3.click();
		WebElement checkbox4=driver.findElement(By.xpath("//input[@value='option-4']"));
		checkbox4.click();
		*/
		List<WebElement> multiplecheckbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement box:multiplecheckbox) {
			box.click();
			
		}
	}
	public void radiobuttons() {
		WebElement radiobutton=driver.findElement(By.xpath("//form[@id='radio-buttons']"));
		WebElement button1=driver.findElement(By.xpath("//input[@value='green']"));
		button1.click();
		WebElement button2=driver.findElement(By.xpath("//input[@value='blue']"));
		button2.click();
		WebElement button3=driver.findElement(By.xpath("//input[@value='yellow']"));
		button3.click();
		WebElement button4=driver.findElement(By.xpath("//input[@value='orange']"));
		button4.click();
		WebElement button5=driver.findElement(By.xpath("//input[@value='purple']"));
		button5.click();
		
		
	}
	
	public void selectDesable() {
		WebElement enabledesable=driver.findElement(By.xpath("//form[@id='radio-buttons-selected-disabled']"));
		WebElement first=driver.findElement(By.xpath("//input[@value='lettuce']"));
		first.click();
		System.out.println(first.isSelected());
		WebElement second=driver.findElement(By.xpath("//input[@value='cabbage']"));
		second.click();
		//System.out.println(second.isEnabled());
		WebElement third=driver.findElement(By.xpath("//input[@value='pumpkin']"));
		third.click();
		//System.out.println(third.isDisplayed());
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='fruit-selects']"));
		Select select=new Select(dropdown);
		//select.selectByIndex(0);

		//select.selectByValue("orange");
		WebElement dropdowndisabled=driver.findElement(By.xpath("//option[@value='orange']"));
		//System.out.println(dropdowndisabled.isEnabled());
		
		//select.selectByVisibleText("Pear");
		//select.selectByIndex(3);

	}
public static void main(String[] args) {
	
	Practice sample=new Practice();
	sample.dropdowns();
	//sample.dropmenu1();
	//sample.dropmenu2();
	//sample.dropmenu3();
	sample.checkbox();
	//sample.radiobuttons();
	//sample.selectDesable();
}
}
