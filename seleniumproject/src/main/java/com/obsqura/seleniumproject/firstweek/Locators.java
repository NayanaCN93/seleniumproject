package com.obsqura.seleniumproject.firstweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends BrowserInitialisation1{
	
	public void idLocator() {
		WebElement messagefield=driver.findElement(By.id("single-input-field"));
		WebElement messagefeild1=driver.findElement(By.id("button-one"));
		WebElement messagefeild2=driver.findElement(By.id("message-one"));
		WebElement messagefeild3=driver.findElement(By.id("button-two"));
		WebElement messagefeild4=driver.findElement(By.id("collapsibleNavbar"));
	}
public void classLocator() {
	WebElement classname=driver.findElement(By.className("navbar-brand"));
	WebElement classname1=driver.findElement(By.className("navbar-nav"));
	WebElement classname2=driver.findElement(By.className("col-lg-9 col-md-9 col-sm-12 col-xs-12"));
	WebElement classname3=driver.findElement(By.className("container page"));
	
}
public void nameLocator() {
	WebElement nameLocator=driver.findElement(By.name("keywords"));
	WebElement nameLocator1=driver.findElement(By.name("description"));
	WebElement nameLocator2=driver.findElement(By.name("author"));
	WebElement nameLocator3=driver.findElement(By.name("viewport"));
	
}
public void linktextLocator() {
	WebElement linkLocator=driver.findElement(By.linkText("check-box-demo.php"));
	WebElement linkLocator1=driver.findElement(By.linkText("radio-button-demo.php"));
}
public void partiallinkLocator() {
	WebElement partialLocator=driver.findElement(By.partialLinkText("check-box"));
	WebElement partialLocator1=driver.findElement(By.partialLinkText("button"));
	
}
public void cssselector() {
	/*tag and id
	tag and class
	tag and attribute
	tag,class and attribute*/
	
	//tag#id+
WebElement csstagid=driver.findElement(By.cssSelector("input#single-input-field"));
WebElement csstagid1=driver.findElement(By.cssSelector("input#value-a"));
WebElement csstagid2=driver.findElement(By.cssSelector("input#value-b"));
//tag.class
WebElement csstagclass=driver.findElement(By.cssSelector("ul.navbar-nav"));
WebElement csstagclass1=driver.findElement(By.cssSelector("section.clearfix"));
WebElement csstagclass2=driver.findElement(By.cssSelector("div.header-top"));
//tag[attributetype=attributevalue]
WebElement cssattribute=driver.findElement(By.cssSelector("input[id=single-input-field]"));
WebElement cssattribute1=driver.findElement(By.cssSelector("input[id=value-a]"));
WebElement cssattribute2=driver.findElement(By.cssSelector("input[id=value-b]"));
//tag.class[attributetype=attributevalue]
WebElement cssattributeclass=driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
WebElement cssattributeclass1=driver.findElement(By.cssSelector("input.form-control[id=value-a"));
WebElement cssattributeclass2=driver.findElement(By.cssSelector("input.form-control[id=value-b"));
}

public void absolutexpath() {
	WebElement absolute=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
	WebElement absolute1=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div[1]/input"));
}
public void relativexpath() {
	WebElement relative=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	WebElement relative2=driver.findElement(By.xpath("//input[@id='value-a']"));
	WebElement relative3=driver.findElement(By.xpath("//input[@id='value-b']"));
	
}
public void dynamicxpath() {
	//contains()
	WebElement dynamic=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
	WebElement dynamic1=driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
	//text()
	WebElement dynamictext=driver.findElement(By.xpath("//button[text()='Show Message']"));
	WebElement dynamictext1=driver.findElement(By.xpath("//button[text()='Get Total']"));
	//index
	WebElement dynamicindex1=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	WebElement dynamicindex2=driver.findElement(By.xpath("((//input[@type='text'])[2]"));
	WebElement dynamicindex3=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
