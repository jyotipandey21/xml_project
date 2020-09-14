
package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Util.Browser;
import page.CustomerPage;
import page.LoginPage;

public class LoginTest extends CustomerTest  {

	WebDriver driver;

	LoginPage login;
	//CustomerPage customerpage;

	@BeforeTest
	public void browser() {
		driver = Browser.launch();
		
	}

	@Test(priority=1)
	@Parameters({"Username","Password"})
	public void page(String username,String password) throws InterruptedException {
	      login = PageFactory.initElements(driver, LoginPage.class);
	     // customerpage=PageFactory.initElements(driver, CustomerPage.class);
		login.enterusername(username);
		login.enterpassword(password);
		login.signin();
//		customerpage.CustomerElement();
//		customerpage.AddCustomerElement();
	}
}
