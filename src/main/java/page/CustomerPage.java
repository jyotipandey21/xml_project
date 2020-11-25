package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Util.basepage;

public class CustomerPage {
	WebDriver driver;

	public CustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customers')]")
	WebElement Customers_Locator;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Customer')]")
	WebElement AddCustomers_Locator;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'List Customers')]")
	WebElement ListCustomers_Locator;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Groups')]")
	WebElement Group_Locator;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement Name;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement Company1;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement Email;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement Phone;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement Address;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement City;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement State;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement Zip;
	@FindBy(how = How.XPATH, using = "//span[@id='select2-country-container']")
	WebElement Country1;
	@FindBy(how = How.XPATH, using = "//input[@class='select2-search__field']")
	WebElement Tags;
	@FindBy(how = How.XPATH, using = "//select[@id='currency']")
	WebElement Currency;
	@FindBy(how = How.XPATH, using = "//select[@id='group']")
	WebElement Group;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//input[@id='cpassword']")
	WebElement ConfirmPassword;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement save;
	@FindBy(how = How.XPATH, using = "//div[@class='ibox-title']/a")
	WebElement importContact;

	public void CustomerElement() throws InterruptedException {
		 System.out.println("The thread ID "+ Thread.currentThread().getId());

		basepage.waitforElement(driver, 60, By.linkText("Customers"));
		
		Customers_Locator.click();
	}

	public void AddCustomerElement() {
		basepage.waitforElement(driver, 60, By.xpath("//a[contains(text(),'Add Customer')]"));
		AddCustomers_Locator.click();
	}

	public void ListCustomerElement() {
		ListCustomers_Locator.click();
	}

	public void Groups_Element() {
		Group_Locator.click();
	}

	public void Full_name(String name) {
		basepage.waitforElement(driver, 60, By.xpath("//input[@id='account']"));
		//String FullName = name + basepage.randomNumGenerator1("//input[@id='account']", "Full Name");
		Name.sendKeys(name);
	}

	public void Company_Element(String company) {
		basepage.dropDown(Company1, company);
		
	}

	public void emailElement(String email) {
		//String emailElement = basepage.randomNumGenerator1("//input[@id='email']", "Email") + email;
		Email.sendKeys(email);
	}

	public void Phone_Element(String phone) {
		//String Phone_Element = basepage.randomNumGenerator1("//input[@id='phone']", "Phone") + phone;
		Phone.sendKeys(phone);
	}

	public void Address_Element(String address) {
		Address.sendKeys(address);
	}

	public void City_Element(String city) {
		City.sendKeys(city);
	}

	public void StateELement(String state) {
		State.sendKeys(state);
	}

	public void Zip_Element(String zip) {
	//	String Zip_Element = zip+basepage.randomNumGenerator1("//input[@id='zip']", "Zip");
		Zip.sendKeys(zip);
	}

	public void Country_Element(String country) {
		basepage.dropDown(Country1,country );
		Country1.sendKeys(country);
	}

	

	public void CurrencyElement(String currency) {
		basepage.dropDown(Currency, currency);
		Currency.sendKeys(currency);
	}

	public void Group_Element(String group) {
		Group.sendKeys(group);
	}

	public void PasswordElement(String passworde) {
		Password.sendKeys(passworde);
	}

	public void ConfirmPasswordElement(String confirmpassword) {
		ConfirmPassword.sendKeys(confirmpassword);
	}

	public void saveElement() {
		basepage.waitforElement(driver, 60, By.xpath("//button[@id='submit']"));
		save.click();
	}

	public void importContactElement() {
		importContact.click();
	}

}
