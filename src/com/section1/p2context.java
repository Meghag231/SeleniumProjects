package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class p2context 
{
	public static void main(String[]args)
	{

        WebDriver driver = new EdgeDriver();
	    driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.selenium.dev/");
	    WebElement downloads=driver.findElement(By.xpath("//span[text()='Downloads']"));
	    Actions s = new Actions(driver);
	    s.moveToElement(downloads).click().build().perform();
	   WebElement w= driver.findElement(By.linkText("documentation"));
	  
	    s.contextClick(w).perform();
	    
	}

}
