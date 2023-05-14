package com.section1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class screenamazon
{
	
	public static void main(String[]args) throws IOException
	{
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement w = driver.findElement(By.id("nav-logo-sprites"));
	File src = w.getScreenshotAs(OutputType.FILE);
	File trg = new File("./screenshot/amazon.png");
	 FileUtils.copyFile(src,trg);
	 
	}
}
