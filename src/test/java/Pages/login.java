package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {

	WebDriver driver;

	By usernameText = By.id("name");
	By passwordText = By.id("password");
	By loginBtn = By.id("login");

	public void enterUsername(String username) {

		driver.findElement(usernameText).sendKeys(username);

	}

	public void enterPassword(String password) {

		driver.findElement(passwordText).sendKeys(password);

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
