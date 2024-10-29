package pojo.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.org.BaseClass;

public class Login_IIE_Invoice extends BaseClass {
	
	public Login_IIE_Invoice() {
		PageFactory.initElements(driver, this);
	}
		
	
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement Username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement Password;
	
	@FindBy(xpath="//button[@id='cmdSubmit']")
	private WebElement Loginh_Submit;

	public WebElement getUsername() {
		return Username;
	}

	public void setUsername(WebElement username) {
		Username = username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(WebElement password) {
		Password = password;
	}

	public WebElement getLoginh_Submit() {
		return Loginh_Submit;
	}

	public void setLoginh_Submit(WebElement loginh_Submit) {
		Loginh_Submit = loginh_Submit;
	}
	

}
