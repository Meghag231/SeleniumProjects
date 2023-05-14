package com.section1;

import org.openqa.selenium.By;

import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart2
{
	EdgeDriver driver;
	public static void main(String[]args) throws InterruptedException 
	{
		Flipkart2 f=new Flipkart2();
		f.launchbrowser();
		System.out.println(f.getRatings());
	    System.out.println(f.getReviews());
	  }
	public void launchbrowser() throws InterruptedException 
	{
		    driver = new EdgeDriver();
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    driver.get("https://www.flipkart.com/");
		    driver.findElement(By.xpath("//button[text()='✕']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.name("q")).sendKeys("television");
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector("[type='submit']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		    Thread.sleep(2000);
		    
		    
	}
	public String getRatings()
	{
		String res=driver.findElement(By.xpath("//span[contains(text(),'1,316 Ratings')]")).getText();///../div/span/span/span/span")).getText();
		return res;
		
	}
    public String getReviews()
	{
		String res1=driver.findElement(By.xpath("//span[contains(text(),'134 Reviews')]")).getText();
		return res1;
		
	}
	
}



