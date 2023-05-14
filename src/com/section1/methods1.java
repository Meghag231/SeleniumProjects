package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;


public class methods1
{
	public static void main(String[]args)
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		WebElement w1=driver.findElement(By.xpath("//div[text()='Companies']"));
		w1.click();
		WebElement w2=driver.findElement(By.xpath("//span[contains(text(),'Foreign MNC')]"));
		w2.click();	
		WebElement w3=driver.findElement(By.xpath("//h2[contains(@class,'subhead')]"));
		System.out.println(w3.getTagName());
		String text=w3.getText();
		System.out.println("result of the mnc "+text);
		Point location = w1.getLocation();
		System.out.println("x and y coradinate:"+location);
		
		Rectangle r=w2.getRect();
		System.out.println("height"+r.getHeight());
		System.out.println("width"+r.getWidth());
		
		
		
		System.out.println("x cordinate +r.X");
		System.out.println("y cordinate +r.Y");
		
		
	}
}

	
