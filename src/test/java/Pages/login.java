package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class login {

	WebDriver driver;

	By usernameText = By.id("name");
	By passwordText = By.id("password");
	By loginBtn = By.id("login");

	public void enterUsername(String username) {

		driver.findElement(usernameText).sendKeys(username);
		System.out.println("THIS IS USA EDIT");
		System.out.println("THIS IS INDIA Adding After USA Edit");
		System.out.println("THIS IS USA Editing adding Develop Branch");
	}

	public void enterPassword(String password) {

		driver.findElement(passwordText).sendKeys(password);
		System.out.println("THIS IS USA EDIT AGAIN");
		System.out.println("THIS IS INDIA Adding After USA Edit");

	}

	public void clickLoginButton() {

		driver.findElement(loginBtn).click();

	}

	public void validUserLogin(String username, String password) {

		driver.findElement(usernameText).sendKeys(username);
		driver.findElement(passwordText).sendKeys(password);
		driver.findElement(loginBtn).click();
	}

}
