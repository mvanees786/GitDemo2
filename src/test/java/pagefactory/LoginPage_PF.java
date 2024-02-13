package pagefactory;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;




public class LoginPage_PF {
	
	@FindBy(id="name")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="login")
	WebElement loginBtn;
	
	public void loginuser(String username, String password) {
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
	}

}
