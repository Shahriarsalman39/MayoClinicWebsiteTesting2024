package keyWorkDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	
	WebDriver driver;

	
	public Login_page(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements( driver, this);
	}
	
	@FindBy (xpath="//input[@id='MayoClinicNumber']") public WebElement clinic_number;
	@FindBy(xpath="//span[@id='ActivationCodeSpan']/input[1]") public WebElement active_c1;
	@FindBy(xpath="//span[@id='ActivationCodeSpan']/input[2]") public WebElement active_c2;
	@FindBy(xpath="//span[@id='ActivationCodeSpan']/input[3]") public WebElement active_c3;
	@FindBy(xpath="//input[@id='Email']") public WebElement emaiL;
	@FindBy(xpath="//input[@name='ReTypeEmail']") public WebElement Re_TYpe_emaiL;
	@FindBy(xpath="//input[@name='FirstName']") public WebElement F_name;
	@FindBy(xpath="//input[@id='MiddleName']") public WebElement M_name;
	@FindBy(xpath="//input[@id='LastName']") public WebElement L_name;
	@FindBy(xpath="//select[@name='birth[month]']/option[4]") public WebElement BOD_Month;
	@FindBy(xpath="//select[@name='birth[day]']/option[text()='11']") public WebElement BOD_day;
	@FindBy(xpath="//select[@class='birth-year']/option[text()='1995']") public WebElement BOD_year;
	//@FindBy(xpath="//*[@name='a-va8gzmp92xnn']") public WebElement Click_Not_Robot;
	@FindBy(xpath="//input[@id='submitBtn']") public WebElement continuE;

	
	
	public WebElement Clinic_Number1(String EnterClinicNumber) {
		clinic_number.sendKeys(EnterClinicNumber);
		return clinic_number;
	}
	
	public WebElement activationCode1(String enter_ActiveCode1) {
		active_c1.sendKeys(enter_ActiveCode1);
		return active_c1;
	}
	
	public WebElement activationCode2(String enter_ActiveCode2) {
		active_c2.sendKeys(enter_ActiveCode2);
		return active_c2;
	}
	public WebElement activationCode3(String enter_ActiveCode3) {
		active_c3.sendKeys(enter_ActiveCode3);
		return active_c3;
	}
	public WebElement Email(String EnterEmail) {
		emaiL.sendKeys(EnterEmail);
		return emaiL;
	}
	public WebElement reType_Email(String Retype_EnterEmail) {
		Re_TYpe_emaiL.sendKeys(Retype_EnterEmail);
		return Re_TYpe_emaiL;
	}
	
	public WebElement Firstname(String enterF_name) {
		F_name.sendKeys(enterF_name);
		return F_name;
	}
	public WebElement MiddleName(String enterM_name) {
		M_name.sendKeys(enterM_name);
		return M_name;
	}
	public WebElement LastName(String enterL_name) {
		L_name.sendKeys(enterL_name);
		return L_name;
	}

	public void DOB() {
		BOD_Month.click();
		BOD_day.click();
		BOD_year.click();
		
	}
    /*public void Not_robot() {
	try {
		Thread.sleep(10);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
		Click_Not_Robot.click();
	}*/
	public void Click_continue() {
		continuE.click();
	}
	
	
}
