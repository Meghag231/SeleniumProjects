package com.section1;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class part2actscrol
{
	public static void main(String[]args) throws IOException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[text()='Documentation']")).click();
		driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
		driver.findElement(By.xpath("//span[text()='Actions API']")).click();
		driver.findElement(By.xpath("//span[text()='Wheel']")).click();
		WebElement ScrollElement = driver.findElement(By.id("tabs-05-00"));
		//WebElement ScrollElement = driver.findElement(By.cssSelector(" .language-java"));
		ScrollOrigin se = ScrollOrigin.fromElement(ScrollElement);
		Actions act = new Actions(driver);
		//act.scrollFromOrigin(se,0,900).perform();
		act.scrollFromOrigin(se,600,0).perform();
	    //JavascriptExecutor js =(JavascriptExecutor)driver;
		
		// js.executeScript("scrollBy(4500,0)");  
		 TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File trg = new File("./screenshot/selenium.png");
			FileUtils.copyFile(src, trg);
		
	}

}
