package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginPOM {

	WebDriver driver = null;
	
	@Given("User is on logiin page")
	public void user_is_on_logiin_page() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/mvanees/Downloads/114/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password (String username, String password) throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
	}
	
	@When("click login button")
	public void click_login_button() {
		driver.findElement(By.id("login")).click();
	}

	@Then("user is navigated to home pages")
	public void user_is_navigated_to_home_pages() {
		
		String title = driver.getTitle();
		System.out.println("Title is " + title);
		driver.quit();
	}

}
