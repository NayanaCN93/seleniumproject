package com.obsqura.seleniumproject.firstweek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends BrowserInitialisation1{
	public void fulltable(){
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
	}
	public void selectrow() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]"));
		System.out.println(row.getText());
	}
	public void selectColoumn() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> column=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for(WebElement singlecolumn:column) {
			System.out.println(singlecolumn.getText());
		}
	}
public void singleData() {
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement data=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[2]"));
	System.out.println(data.getText());
}
public void finddata() {
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	String input="Ashton Cox";
	List<WebElement> findnew=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[1]"));
	for(WebElement newdata:findnew) {
		if(newdata.getText().equals(input)) {
			System.out.println(newdata.getText());
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TableHandling handling=new TableHandling();
handling.browserInitialisation();
handling.fulltable();
System.out.println("**********");
handling.selectrow();
System.out.println("**********");
handling.selectColoumn();
System.out.println("**********");
handling.singleData();
System.out.println("**********");
handling.finddata();
	}

}
