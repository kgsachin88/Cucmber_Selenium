//package stepDefinition;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//
//
//public class LoginStepDefinition {
//
//	static WebDriver driver; 
//	
//	
//	@Given("^user is already on Login Page$")
//	public void user_is_already_on_Login_Page() {
//	 System.setProperty("webdriver.chrome.driver",".//exes//chromedriver.exe");
//	 driver = new ChromeDriver();
//	 driver.manage().window().maximize();
//     driver.get("https://www.freecrm.com/index.html");
//     String PgTitle=driver.getTitle();
//     System.out.println(PgTitle);
//     Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", PgTitle);
//	}
//	
//	//Use the regular expression --> \"(.*)\"
//	 @Then("^User Enter \"(.*)\" and \"(.*)\"$")
//	 public void User_Enter_Username_and_Password(String Username,String Password){
//	 driver.findElement(By.name("username")).sendKeys(Username);
//	 driver.findElement(By.name("password")).sendKeys(Password);
//	 }
//	 
//	 
//	 @Then("^User clicks on login button$")
//	 public void User_clicks_on_login_button() {
//	 WebElement loginBtn =driver.findElement(By.xpath("//input[@type='submit']"));
//	 JavascriptExecutor js = (JavascriptExecutor)driver;
//	 js.executeScript("arguments[0].click();", loginBtn);
//	 }
//	
//	
//	 @Then("^user is on home page$")
//	 public void user_is_on_hopme_page(){
//	 String title = driver.getTitle();
//	 System.out.println("Home Page title ::"+ title);
//	 Assert.assertEquals("CRMPRO", title);
//	 }
//	
//	 @Then("^user moves to new contact page$")
//	 public void user_moves_to_new_contact_page() {
//		 driver.switchTo().frame("mainpanel");
//		 
//		 WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
//		 Actions actions = new  Actions(driver);
//		 actions.moveToElement(target).build().perform();
//		 driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//		 
//	 }
//	 
//	 @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	 public void user_enters_contacts_details(String firstname, String lastname, String position){
//		 driver.findElement(By.id("first_name")).sendKeys(firstname);
//		 driver.findElement(By.id("surname")).sendKeys(lastname);
//		 driver.findElement(By.id("company_position")).sendKeys(position);
//		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//	 }
//	 
//	 @Then("^close the browser$")
//	 public void close_the_browser() {
//		 driver.quit();
//	 }
//	
//}
