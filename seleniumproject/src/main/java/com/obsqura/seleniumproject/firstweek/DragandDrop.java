package com.obsqura.seleniumproject.firstweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends BrowserInitialisation1{
public void drag() {
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement dragable1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	Actions actions=new Actions(driver);
	actions.moveToElement(dragable1);
	//actions.doubleClick(dragable1).perform();
	WebElement destination=driver.findElement(By.xpath("//div[@id=\"mydropzone\"]"));
	actions.dragAndDrop(dragable1, destination).build().perform();
	
	WebElement dragable2=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
	Actions actions2=new Actions(driver);
	actions.moveToElement(dragable2);
	WebElement destination2=driver.findElement(By.xpath("//div[@id=\"mydropzone\"]"));
	actions2.dragAndDrop(dragable2, destination2).build().perform();
	
	WebElement dragable3=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
	Actions actions3=new Actions(driver);
	actions.moveToElement(dragable3);
	WebElement destination3=driver.findElement(By.xpath("//div[@id=\"mydropzone\"]"));
	actions3.dragAndDrop(dragable3, destination3).build().perform();
	
	WebElement dragable4=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
	Actions actions4=new Actions(driver);
	actions.moveToElement(dragable4);
	WebElement destination4=driver.findElement(By.xpath("//div[@id=\"mydropzone\"]"));
	actions2.dragAndDrop(dragable4, destination4).build().perform();
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DragandDrop dragdrop=new DragandDrop();
dragdrop.browserInitialisation();
dragdrop.drag();
	}

}
