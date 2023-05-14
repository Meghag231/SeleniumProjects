package com;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class seleninumcolorandfont
{
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		//launch Chrome
		ChromeOptions co=new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/");
		
		//color
		WebElement error=driver.findElement(By.xpath("//h4[contains(@class,'selenium-ide')]"));
		String color=error.getCssValue("color");
		//Dimension size1 =size.getSize();
		System.out.println(color);
		
		//font
		WebElement error1=driver.findElement(By.xpath("//h4[contains(@class,'selenium-ide')]"));
		String font=error1.getCssValue("font");
		System.out.println(font);
		
		// excel sheet
	    FileInputStream fis=new FileInputStream("C:\\selenium3rd\\book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet2");
		sh.createRow(0).createCell(0).setCellValue(color);
		sh.getRow(0).createCell(1).setCellValue(font);
		FileOutputStream fis1= new FileOutputStream("C:\\selenium3rd\\book1.xlsx");
		book.write(fis1);
		fis1.flush();
		System.out.println("pass");
		
		
	
	}

}
