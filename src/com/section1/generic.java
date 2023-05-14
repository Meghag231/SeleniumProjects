package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class generic 
{
	EdgeDriver driver;
	public static void main(String[]args) throws InterruptedException
	
	{
		String product="toys";
		generic gm=new generic();
		gm.launchBrowser();
		gm.loginApp();
		String result=gm.searchToys(product);
		System.out.println(result);
		gm.closeBrowser();
	}
	public void launchBrowser()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		
	}
	public void loginApp()
	{
		driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath("//button[text()='X']")).click();
	}
	public String searchToys(String product) throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys(product);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(2000);
	    String result=driver.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText();
		return result;
	}
	public void closeBrowser()
	{
		driver.close();
	
}
}




