package com.section1;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


public class Flipkart11 
{
EdgeDriver driver;
public static void main(String []args) throws InterruptedException
{
	Flipkart11 ii=new Flipkart11();
	ii.launchbrowser();
	
	String result=ii.searchprice();
	System.out.println(result);
	
	
}
    public void launchbrowser() throws InterruptedException
    {
    driver = new EdgeDriver();
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.get("https://www.flipkart.com/");
    driver.findElement(By.xpath("//button[text()='✕']")).click();
    Thread.sleep(2000);
    driver.findElement(By.name("q")).sendKeys("iphonex");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("[type='submit']")).click();
    
    
    
    }
    public String searchprice()throws InterruptedException
    {
//    	String result=driver.findElement(By.xpath("//span[text()='APPLE iPhone X (Silver, 64 GB)']/../../div[2]/div[1]/div[1]")).getText();
    	
    	
    	String result=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[2]/div[1]/div/div")).getText();

       return result;
    
    }
    
}

