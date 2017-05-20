package com.package1;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFirstAppTest {

	/**
	 * @param args
	 */
	
	//public WebDriver dr;
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
      //System.out.println("Maven configured successfully");
	//}
	
	
	@Test
	void FirstTest()
	{
	  
		System.out.println("Maven configured successfully");
		System.setProperty("webdriver.chrome.driver", "C:\\GeckoDriver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-surefire-plugin");
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.manage().window().maximize(); 
		
		//Assert.assertEquals("Not displyed correctly", dr.getTitle().toString(),"Maven Repository: org.apache.maven.plugins » maven-surefire-plugin");
		dr.close();
		dr.quit();                                   
	     
	}

}
