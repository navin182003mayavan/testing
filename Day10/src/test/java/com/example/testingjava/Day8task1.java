package com.example.testingjava;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day8task1 {
	public
	Day8task1 cl = new Day8task1();
  @Test(dataProvider = "testData")
  public void addMethod(int a,int b,int excepted) {
	  int result=cl.add(a,b);
	  Assert.assertArrayEquals(expected,result);
  }
  @DataProvider
  public Object[][] testData(){
	  return new Object[][] {
		  {1,2,3},{2,2,5}
	  };
  }
}
