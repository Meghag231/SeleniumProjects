package com.section1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class p2selecthandling {
	public static void main(String[] args) throws IOException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// get the url
		driver.get("http://demo.actitime.com/login.do");
		
		// login
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER);
		
		// settings
		driver.findElement(By.xpath("//div[@class='menuTable']//div[@class='popup_menu_button popup_menu_button_settings ']")).click();
		driver.findElement(By.id("popup_menu_item_6")).click();
		
		// select
		WebElement productLine = driver.findElement(By.id("firstHierarchyLevelCodeSelect"));		
		Select s = new Select(productLine);
		s.selectByVisibleText("Product Line");
		s.selectByVisibleText("Client");
		s.selectByVisibleText("Product Line");
		
		// get the msg
		WebElement modMsg = driver.findElement(By.id("FormModifiedTextCell"));
		System.out.println(modMsg.getText());
		
		File src = modMsg.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot/modificationMsg.png");
		FileUtils.copyFile(src, trg);
		
		// close driver
		//driver.close();
	}
}
