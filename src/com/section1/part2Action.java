package com.section1;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class part2Action 
{
	EdgeDriver driver;
	public static void main(String[]args) throws AWTException, InterruptedException, IOException
	{
		part2Action g=new part2Action();
		g.launchbrowser();
		System.out.println(g.result());
	}
		
	   public void launchbrowser() throws InterruptedException, IOException
	    {
		   
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).sendKeys(Keys.SHIFT,"ipl");
		Actions a= new Actions(driver);
		a.keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		WebElement w=driver.findElement(By.className("gLFyf"));
		w.sendKeys("ipl");
		a.keyDown(Keys.CONTROL).sendKeys("a").perform();
		a.keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		a.keyDown(Keys.CONTROL).sendKeys("c").perform();
		a.keyUp(Keys.CONTROL).perform();
		a.keyDown(Keys.ENTER);
		a.keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File trg = new File("./screenshot/ipl.png");
	    FileUtils.copyFile(src, trg);
		driver.findElement(By.xpath("//a[text()='News']")).click();
	}
	        public String result()
	    {
	        	
	        String res=driver.findElement(By.id("result-stats")).getText();
			return res;
	
		}

}
