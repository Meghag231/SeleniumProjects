package com.section1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class part2scrollrobo
{
	public static void main(String[]args) throws AWTException, InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_PAGE_DOWN);
		 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_PAGE_DOWN);
		 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_PAGE_UP);
		 r.keyRelease(KeyEvent.VK_PAGE_UP);
		 
		 
		 
		 
		 
		
		
		
		
	}

}
