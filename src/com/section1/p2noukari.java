package com.section1;

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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class p2noukari {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 ChromeOptions co=new ChromeOptions();
		   co.addArguments("--remote-allow-origins=*");
		   WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  Actions act=new Actions(driver);
		WebElement wb= driver.findElement(By.xpath("//div[text()='Jobs']"));
		act.moveToElement(wb).perform();//move to job
		
		driver.findElement(By.xpath("//div[text()='Jobs in Bangalore']")).click();//click on jobs
		// scrolling by draganddropby
		WebElement start=driver.findElement(By.cssSelector(".cir"));
		//Thread.sleep(2000);
		act.dragAndDropBy(start,-170, 0).perform();
		
		String str=driver.findElement(By.xpath("//div[@class='h1-wrapper']")).getText();
		System.out.println(str);
		//scroll to amount
		 
		act.scrollByAmount(0, 1000);
		//click on site map
		driver.findElement(By.xpath("//a[text()='Sitemap']")).click();
		
		//takescreenshot of entire page
		TakesScreenshot T=(TakesScreenshot)driver;
		File src=T.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Selenium/page.png");
		FileUtils.copyFile(src, trg);
		
		
		
		
		
	}

}