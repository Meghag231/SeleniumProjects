package com.section1;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class p2autoselect {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.className("gLFyf")).sendKeys(Keys.SHIFT,"selenium");
		 Actions act=new Actions(driver);
		 act.keyDown(Keys.ARROW_DOWN).perform();
		 act.keyDown(Keys.ARROW_DOWN).perform();
		 act.keyDown(Keys.ARROW_DOWN).perform();
		 act.keyDown(Keys.ARROW_DOWN).perform();
		 act.keyDown(Keys.ENTER).perform();
		 WebElement res=driver.findElement(By.xpath("//div[starts-with(text(),'About')] "));
		 System.out.println(res.getText());
	}
	}

