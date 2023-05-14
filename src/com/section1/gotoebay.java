package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class gotoebay 
{

	public static void main(String[]args)
	{
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		By SearchLoc=By.id("gh-ac");
		WebElement SearchBox = driver.findElement(SearchLoc);
		SearchBox.sendKeys("Mobiles");
		
		
		
}
	
}