package com.obsqura.seleniumproject.firstweek;

public class BrowserCommands extends BrowserInitialisation1 {
public void browserCommands() {
	String title= driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String pagesourse=driver.getPageSource();
		System.out.println(pagesourse);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BrowserCommands command=new BrowserCommands();
command.browserInitialisation();
command.browserCommands();

	}

}
