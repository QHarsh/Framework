package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_OR {

	@FindBy(css = ".login-btn")
	private List<WebElement> listBtnLoginRegister;
	
	
	public List<WebElement> getListBtnLoginRegister() {
		return listBtnLoginRegister;
	}


	public List<WebElement> getListTextMobileNumber() {
		return listTextMobileNumber;
	}


	@FindBy(xpath  = "//input[@placeholder='Mobile Number']")
	private List<WebElement> listTextMobileNumber;
	
	
	@FindBy(css = ".otp_input")
	private List<WebElement> listTextOtp;


	public List<WebElement> getListTextOtp() {
		return listTextOtp;
	}
	
	
	@FindBy(css = ".login_btn.btn-block")
	private List<WebElement> listBtnContinue;


	public List<WebElement> getListBtnContinue() {
		return listBtnContinue;
	}
	
	
	@FindBy(xpath  = "//input[@aria-label='name']")
	private List<WebElement> listTextName;
	
	
	public List<WebElement> getListTextName() {
		return listTextName;
	}


	public List<WebElement> getListTextEmail() {
		return listTextEmail;
	}


	@FindBy(xpath  = "//input[@aria-label='name']")
	private List<WebElement> listTextEmail;
	
	
	
	
}
