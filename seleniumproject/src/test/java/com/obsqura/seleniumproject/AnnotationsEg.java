package com.obsqura.seleniumproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AnnotationsEg {
  @Test
  public void print() {
	  System.out.println("hello");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("aftermethod");
  }
  @Test 
  public void demo() {
	  System.out.println("hi");
	  
  }

}
