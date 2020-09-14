
  package Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
  
  static WebDriver driver;
  
  
  public static WebDriver launch() {
  
  System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.get("http://www.techfios.com/ibilling/?ng=admin/");
  
  driver.manage().deleteAllCookies();
  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  driver.manage().window().maximize(); return driver; }
  
  }
 
