package com.obsqura.seleniumproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AnnotationEg2 {
  @Test
  public void print() {
	  System.out.println("hello");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforemethod");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("aftermethod");
  }
  

  @BeforeClass
  public void beforeClass() {
	  System.out.println("hbeforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterclass");
  }
  
  

}
