package keyWorkDrivenFramework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_Test extends Base_Test{

	Login_page lp;
	
	@BeforeMethod
	public void openMayoClinic() {
		openApplication();
		
	}
	
	@Test
	public void ValidCreateAccount() {
		lp=new Login_page(driver);
		lp.Clinic_Number1("145278956");
		lp.activationCode1("14526");
		lp.activationCode2("4526");
		lp.activationCode3("786565");
		lp.Email(tr.email1());
		lp.reType_Email(tr.Remail1());
		lp.Firstname(tr.fNmae());
		lp.MiddleName(tr.Mname());
		lp.LastName(tr.Lname());
		lp.DOB();
		//lp.Not_robot();
		lp.Click_continue();
	}
	
	
	@AfterMethod
	public void CloseMayoClinic() {
		closeApplciation();
		
	}
	
}
