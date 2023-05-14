package com.section1;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class rem 
{
	public static void main(String[]args, Object checkboxA)
	{
		WebDriver driver=new EdgeDriver();
		 driver.manage().window().maximize();
	     driver.get("https://demo.actitime.com/login.do");
	     WebElement w =driver.findElement(By.cssSelector("#keepLoggedInCheckBoxContainer"));
	     w.click();
	     if(Checkbox.isSelected)
	     {
	    	 
	    	 System.out.println("Remember password click");
	     }
	     else
	     {
	    	 System.out.println("Remember password not click");
	     }
	  
    }
}
	
