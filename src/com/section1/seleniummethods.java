package com.section1;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class seleniummethods
{
  public static void main(String[]args) throws InterruptedException
  {
	  WebDriver driver = new EdgeDriver();
	  driver.manage().window().maximize();
      driver.get("https://www.selenium.dev/");
      WebElement w =driver.findElement(By.xpath("//a[text()='About']"));
     Rectangle rec = w.getRect();
     System.out.println("width:"+rec.getWidth());
     System.out.println("Height:"+rec.getHeight());
     System.out.println("X:"+rec.getX());
     System.out.println("y:"+rec.getY());
     w.click();
     Thread.sleep(2000);
     WebElement w1 =driver.findElement(By.xpath("//a[text()='History']"));
     System.out.println(w1.getTagName());
         
}
}


