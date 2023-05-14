
package com.section1;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class p2amazon {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		   co.addArguments("--remote-allow-origins=*");
		   WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.cssSelector("[type='text']")).sendKeys("books");
		  driver.findElement(By.id("nav-search-submit-text")).click();
		 driver.findElement(By.xpath("//div[@id='nav-subnav']/a[2]")).click();
		  //enter value in the fields
		   WebElement book=driver.findElement(By.xpath("//select[@name='node']"));
		  Select st=new Select(book);
		  st.selectByIndex(21);
		  WebElement b=driver.findElement(By.xpath("//select[@name='p_n_feature_browse-bin']"));
		  Select t=new Select(b);
		  t.selectByIndex(1);
		 WebElement lang= driver.findElement(By.xpath("//select[@name='field-language']"));
		 Select s=new Select(lang);
		 s.selectByIndex(1);
		 WebElement w= driver.findElement(By.xpath("//select[@name='field-dateop']"));
		 Select l=new Select(w);
		 l.selectByIndex(3);
		 WebElement mon= driver.findElement(By.xpath("//select[@name='field-datemod']"));
		 Select sel=new Select(mon);
		 sel.selectByIndex(4);
		driver.findElement(By.xpath("//input[@name='field-dateyear']")).sendKeys("1990");
		WebElement e= driver.findElement(By.xpath("//select[@name='sort']"));
		Select sc=new Select(e);
		 sc.selectByIndex(2);
		 driver.findElement(By.cssSelector("[type='image']")).click();
		  
		 //takescreenshot of entire webpage
		    TakesScreenshot T=(TakesScreenshot)driver;
			File src=T.getScreenshotAs(OutputType.FILE);
			File trg=new File("./Selenium/Book.png");
			FileUtils.copyFile(src, trg);
	}

}