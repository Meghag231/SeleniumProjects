package com.section1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class p2getopt 
{
	public static void main(String [] args)
	{
		WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("file:///C:/Users/Sudha/Desktop/dropdown.html");
    WebElement drop=driver.findElement(By.xpath("//option[text()='- Please select a name -'"));
	
	Select s = new Select(drop);
	List<WebElement> alloptions=s.getOptions();
	for(WebElement option:alloptions)
	{
		System.out.println(option.getText());
	}
	
	
	
	
		
		
		
		
	}

}
