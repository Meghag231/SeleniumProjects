package com.section1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class part2key2
{
	public static void main(String[]args) throws AWTException, IOException, InterruptedException
	{
		System.setProperty("webdriver.Edge.driver","C:\\Users\\Sudha\\Desktop\\selenium\\Edgedriver.exe");
		

	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.SHIFT,"selenium");
    Robot r = new Robot();
	
	//SELECT
       
        r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_A);
	   
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_A);
	    r.keyPress(KeyEvent.VK_DELETE);
	    r.keyRelease(KeyEvent.VK_DELETE);
        Thread.sleep(2000);
        
	    WebElement w = driver.findElement(By.id("twotabsearchtextbox"));
	    w.sendKeys("selenium book with java");
	    w.sendKeys(Keys.CONTROL,Keys.BACK_SPACE);
	    w.sendKeys(Keys.ENTER);
	    
	    
	    
        TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot/AtoZ.png");
		FileUtils.copyFile(src, trg);
	 
	 
}

}


