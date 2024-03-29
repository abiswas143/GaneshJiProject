package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Declare the elements
	@FindBy(name="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwdTB;
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	
	//Intialise the elements
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
		
	//Utilise the elements
	
	public void setUsername(String un) {
		unTB.clear();
		unTB.sendKeys(un);
	}
	
	public void setPassword(String pwd) {
		pwdTB.sendKeys(pwd);
	}
	
	public void clickLogin() {
		loginBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
