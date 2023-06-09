package com.example.testingjava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7task5 {
  @Test
  public void test1() {
	  WebDriverManager.edgedriver().setup();
      WebDriver driver = new EdgeDriver();
      //launching the url
      driver.get("https://www.godaddy.com/en-in");
      //maximizing the webpage
      driver.manage().window().maximize();
      String a = "GoDaddy";
      String url = "https://www.godaddy.com/en-in";
      String b = driver.getCurrentUrl();
    if( driver.getTitle().contains(a))
    {
    	System.out.println("Title matched");
    }
    else if(a==url)
    {
    	
        
      	  System.out.println("Success");
    }
    driver.quit();


  }
  @Test
  public void test2()
  {
	 
  }
 
 
}
