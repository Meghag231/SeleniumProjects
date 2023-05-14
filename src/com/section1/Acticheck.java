package com.section1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Acticheck
{
	//public static void main(String [] args) 
	public static void main(String []args)
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.xpath("//label[text()='Keep me logged in']")).click();
		 driver.findElement(By.xpath("//div[text()='Login ']")).click();
		 
//DriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
// Wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='menuTable']/div[2]]");
		 driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings']/../../..")).click();
	//	 driver.findElement(By.cssSelector(".popup_menu_button.popup_menu_button_settings.popup_menu_button_pressed")).click();
      //  driver.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']")).click();
      //  WebElement SettingDropdown=driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
      // driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
	   //Select s=new Select(SettingDropdown);
	  // s.selectByVisibleText("Product Line");
	   //WebElement logo=driver.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME'"));
	   //File src=logo.getScreenshotAs(OutputType.FILE);
	   //File trg=new File("./Screenshot/logo.png");
	   //FileUtils.copyFile(src, trg);
	   //WebElement res=driver.findElement(By.xpath("//td[text()='MODIFICATIONS NOT SAVED']"));
	   //System.out.println(res);
	
	}

}


