
package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	 WebDriver driver;

	// for each page create constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	//Element Library
		@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
		WebElement UserName;
		@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
		WebElement Password;
		@FindBy(how = How.NAME, using = "login")
		WebElement SignInButton;
		
		public void enterusername(String username) {
		System.out.println("The thread ID for login "+ Thread.currentThread().getId());
			UserName.sendKeys(username);
		}
		public void enterpassword(String password) {
			Password.sendKeys(password);	
		}
		public void signin() {
			SignInButton.click();
			}
		
		
		
		// Methods to interact with the elements
//		public void login(String userName, String password) {
//		UserName.sendKeys(userName);
//		Password.sendKeys(password);
//		SignInButton.click();
//		}
	//
//		public String getPageTitle() {
//		return driver.getTitle();}
	}

