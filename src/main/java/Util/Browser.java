
  package Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Browser {
  
  static WebDriver driver;
  
  @Test
  public static WebDriver launch() {
  
  System.setProperty("webdriver.chrome.driver", "dance\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.get("http://www.techfios.com/billing/?ng=admin/");
  Reporter.log("it passed");
  driver.manage().deleteAllCookies();
  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  driver.manage().window().maximize(); 
   return driver; 
  }
  }
 
