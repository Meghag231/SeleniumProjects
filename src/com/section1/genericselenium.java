package com.section1;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
public class genericselenium
{

	ChromeDriver driver;
	public static void main(String[] args)  throws InterruptedException
	{
		genericselenium s=new genericselenium();
		s.launchChrome();
		s.Action();
	}
	
	public void launchChrome()
	{
      driver=new ChromeDriver();
      driver.manage().window().maximize();
    }
	
public void Action() throws InterruptedException
{
	driver.get("https://www.selenium.dev/downloads/");
	driver.findElement(By.xpath("//span[text()='Documentation']")).click();
	driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Drivers']")).click();
	driver.findElement(By.xpath("//span[text()='Options']")).click();
	String title=driver.getTitle();
	System.out.println("title is:"+title);
	Thread.sleep(2000);
}


}
	
	
	
	
	
	
	
	
	
		
