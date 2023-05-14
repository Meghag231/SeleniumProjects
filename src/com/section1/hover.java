package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class hover
{
	public static void main(String[]args)
	{
		WebDriver driver=new EdgeDriver();
		 driver.manage().window().maximize();
	     driver.get("https://demo.actitime.com/login.do");
	     WebElement w =driver.findElement(By.id("keepLoggedInCheckBox"));
	     String s=w.getAttribute("title");
	     System.out.println(s);
	 }
}

	
