package com.section1;

import org.openqa.selenium.By;


import org.openqa.selenium.edge.EdgeDriver;

public class FlipkartGeneric 
{
	EdgeDriver driver;
	public static void main(String[]args) throws InterruptedException
	{
		
	
		FlipkartGeneric f= new FlipkartGeneric();
		f.launchEdge();
		f.Action();
		f.exit();
	}
	public void launchEdge() throws InterruptedException
	{
       driver=new EdgeDriver();
      driver.manage().window().maximize();
      Thread.sleep(2000);
    }
	
	public String Action() throws InterruptedException
	{
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("_2doB4z")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("_3704LK")).sendKeys("iphone x");
		driver.findElement(By.className("_LOZ3Pu")).click();
		Thread.sleep(2000);
		
		String expproductprice=driver.findElement(By.xpath("//div[text()='APPLE iphone X (silver, 64 GB)']/../../div[2]/div[1]/div)")).getText();
		Thread .sleep(2000);
		System.out.println(expproductprice);
		return expproductprice;
	}
	public void exit()
	{
		driver.close();
	}
}