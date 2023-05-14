package com.section1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class p2dropdownascdupli
{
	@SuppressWarnings("unchecked")
	public static void main(String[]args)
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sudha/Desktop/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement drop = driver.findElement(By.name("Select1"));
		Select s = new Select(drop);
		List<WebElement>all = s.getOptions();
		
		TreeSet ts = new TreeSet();
		for(WebElement a:all)
		{
			ts.add(a.getText());
			
		}
		
		System.out.println(ts);
		
		System.out.println(ts.descendingSet());
		
	}

}


