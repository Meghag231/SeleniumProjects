

package com.section1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class  p2doubleclick 
{
	public static void main(String[]args)
	{
		        WebDriver driver = new EdgeDriver();
			    driver = new EdgeDriver();
			    driver.manage().window().maximize();
			    driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
			   
			    WebElement web = driver.findElement(By.xpath("//button[starts-with(@id,sharing-button-Blog1-byline)]"));
			    Actions s = new Actions(driver);
			    s.doubleClick(web).perform();
			    
			    
			    
	}

}
