package com.section1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Genericway {
	ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		String customerName = "megha";
		Random r = new Random();
		int num = r.nextInt(10000);
		customerName = customerName + num;
		Genericway cc = new Genericway();
		cc.launchBrowser();
		cc.login();
		String expCustomername = cc.createCustomer(customerName);
		System.out.println(expCustomername);
		cc.closeBrowser();
	}

	public void launchBrowser()

	{
		ChromeOptions co=new ChromeOptions();
		   co.addArguments("--remote-allow-origins=*");
		    driver=new ChromeDriver(co);
		driver.manage().window().maximize();
	}

	public void login() throws InterruptedException {
		driver.get("https://demo.actitime.com//login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
	}

	public String createCustomer(String Customername) throws InterruptedException {
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("createNewCustomer")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("(placeholder='Enter Customer Name')")).sendKeys("Customername");
		driver.findElement(By.className("(placeholder='Enter Customer Description')")).sendKeys("qspider");
		driver.findElement(By.xpath("//div(text()='Create Customer']")).click();
		Thread.sleep(2000);
		String expCustomername = driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		return expCustomername;
	}

	public void closeBrowser() {
		driver.close();
	}
}
