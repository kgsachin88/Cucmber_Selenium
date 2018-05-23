//package stepDefinition;
//
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class DealsStepwithMapDefinition {
//
//static WebDriver driver;
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
//     
//	}
//	
//	
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM() {
//		 String title = driver.getTitle();
//		 System.out.println(title);
//		 Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
//	}
//	
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable credentials) {
//		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
//			driver.findElement(By.name("username")).sendKeys(data.get("Username"));
//			driver.findElement(By.name("password")).sendKeys(data.get("Password"));
//		} 
//		
//	}
//	
//	 @Then("^User clicks on login button$")
//	 public void User_clicks_on_login_button() {
//	 WebElement loginBtn =driver.findElement(By.xpath("//input[@type='submit']"));
//	 JavascriptExecutor js = (JavascriptExecutor)driver;
//	 js.executeScript("arguments[0].click();", loginBtn);
//	 }
//	 
//	 @When("^user is on home page$")
//	 public void user_is_on_home_page() {
//		 String HomeTitle = driver.getTitle();
//		 System.out.println(HomeTitle);
//		 Assert.assertEquals("CRMPRO", HomeTitle);
//	 }
//	 
//	 @Then("^user moves to new deal page$")
//	 public void user_moves_to_new_deal_page() {
//		 driver.switchTo().frame("mainpanel");
//		 WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
//		 Actions actions = new  Actions(driver);
//         actions.moveToElement(target).build().perform();
//         driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//        
//	 }
//	 
//	 @Then ("^user enters deal details$")
//	 public void user_enters_deal_details(DataTable dealData) throws InterruptedException {
//		 for (Map<String, String> data : dealData.asMaps(String.class, String.class)) {
//			 Thread.sleep(5000);
//			 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			 driver.findElement(By.xpath("//input[@name='title']")).sendKeys(data.get("title"));
//			 driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
//			 driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
//			 driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
//			 driver.findElement(By.xpath("//input[@value='Save' and @type='submit']")).click();
//			 //move to new deal
//			 WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
//			 Actions actions = new  Actions(driver);
//	         actions.moveToElement(target).build().perform();
//	         driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//			}  
//	 }
//	 
//	
//	 @Then("^Close the browser$")
//	 public void close_the_browser() {
//		 driver.quit();
//	 }
//	
//	
//	
//}
