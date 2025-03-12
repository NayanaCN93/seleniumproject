package com.obsqura.seleniumproject;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority = 2)
  public void sample() {
	  System.out.println("hello");
  }
  @Test(priority=1)
  public void sample2() {
	  System.out.println("hi");
  }
}
  