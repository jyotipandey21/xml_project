package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Util.Browser;
import page.CustomerPage;
import page.LoginPage;

public class CustomerTest {
	
	WebDriver driver;
	LoginPage loginpage;
	CustomerPage customerpage;

	@BeforeTest
	public void launchbrowser() {
		driver = Browser.launch();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		customerpage = PageFactory.initElements(driver, CustomerPage.class);
	}
	@Test(priority =1)
	@Parameters({"Username","Password"})
	public void logincus(String username,String password) {
	loginpage.enterusername(username);
	loginpage.enterpassword(password);
	loginpage.signin();
}
	
	@Test(priority =2)
	@Parameters({"Name", "Company1", "Email", "Phone", "Address", "City", "State", "Zip" })
	public void addcustomer(String name, String company, String email, String phone, String address, String city,
			String state, String zip) throws InterruptedException {

//		loginpage.enterusername(username);
//		loginpage.enterpassword(password);
//		loginpage.signin();
		customerpage.CustomerElement();
		customerpage.AddCustomerElement();
		Thread.sleep(2000);
		customerpage.Full_name(name);
		customerpage.Company_Element(company);
		customerpage.emailElement(email);
		customerpage.Phone_Element(phone);
		customerpage.Address_Element(address);
		customerpage.City_Element(city);

		customerpage.StateELement(state);
		customerpage.Zip_Element(zip);
		customerpage.saveElement();
	}

}
