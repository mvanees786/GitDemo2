package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Browser open");
		System.setProperty("webdriver.chrome.driver", "C:/Users/mvanees/Downloads/116/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@And("user is on gooogle search page")
	public void user_is_on_gooogle_search_page() {
		System.out.println("on Google Search page");
		driver.navigate().to("https://www.google.co.in/");

	}

	@When("user enter text in search box")
	public void user_enter_text_in_search_box() {

		System.out.println("Entered Text");
		driver.findElement(By.name("q")).sendKeys("Iphone");
	}

	@And("hits enter")
	public void hits_enter() {

		System.out.println("Hits  Enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("navigated_to_search_results");
		String title = driver.getTitle();
		System.out.println("Title is " + title);
		driver.quit();
	}

}
