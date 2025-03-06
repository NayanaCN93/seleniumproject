package com.obsqura.seleniumproject.firstweek;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowhandling {
	WebDriver driver;
	public void  multipleWindow() {
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		WebElement contactus=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactus.click();
		WebElement loginportal=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		loginportal.click();
		String parent=driver.getWindowHandle();
		System.out.print("ID of parentwindow:");
		System.out.println(parent);
		Set<String> allwindow= driver.getWindowHandles();
		String title="";
		for(String allchildwindow:allwindow) {
			if(!allchildwindow.equals(parent)) 
			{
			System.out.println(allchildwindow);
			driver.switchTo().window(allchildwindow);
			title=driver.getTitle();
			
			System.out.println(driver.getTitle());
			}
			if(title.equals("WebDriver | Login Portal")) {
				WebElement username=driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
				username.sendKeys("Nayana");
				WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
				password.sendKeys("ishan");
				WebElement loginbutton=driver.findElement(By.xpath("//button[@id='login-button']"));
				loginbutton.click();
				driver.switchTo().alert().accept();
			}
			
		}
		if(title.equals("WebDriver | Contact Us")) {
			WebElement name=driver.findElement(By.xpath("//input[@name='first_name']"));
			name.sendKeys("Nayana");
			WebElement lastname=driver.findElement(By.xpath("//input[@name='last_name']"));
			lastname.sendKeys("CN");
			WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
			email.sendKeys("nayanacn93@gmail.com");
			WebElement comment=driver.findElement(By.xpath("//textarea[@name='message']"));
			comment.sendKeys("Hello");
			WebElement reset=driver.findElement(By.xpath("//input[@value='RESET']"));
			//reset.click();
			WebElement submit=driver.findElement(By.xpath("//input[@value='SUBMIT']"));
			submit.click();
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultipleWindowhandling window=new MultipleWindowhandling();
window.multipleWindow();
	}

}
