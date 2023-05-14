package projectname.genericcode;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import projectname.ElementRepository.loginpage;




public class Baseclass 
 {   
	public WebDriver driver;
	public static WebDriver Listenerdriver;
	public datautility du = new datautility();
	public commonutility cu = new commonutility();
	@Test
	@BeforeClass
	public void launchBrowser()
      {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
      ChromeOptions co =new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  driver = new ChromeDriver(co);
	  Listenerdriver = driver;
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     }
	  // @Parameters({"username","password","url","customername"})
       @BeforeMethod(alwaysRun=true)
      // public void login(String username,String password ,String url,String customername) throws IOException
       public void login() throws IOException
        {
		
	    driver.get(du.getDataFromProporties("url"));
	  //  driver.findElement(By.id("username")).sendKeys(username);
	    loginpage lp= new loginpage(driver);
	    lp.loginApp(du.getDataFromProporties("username"), du.getDataFromProporties("password"));
	   // driver.findElement(By.name("pwd")).sendKeys(password);
	    driver.findElement(By.id("loginButton")).click();
        }
       @AfterClass
       public void closebrowser()
       {
	      driver.quit();
       }
 }
