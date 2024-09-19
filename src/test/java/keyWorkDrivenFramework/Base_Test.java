package keyWorkDrivenFramework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Test {
	WebDriver driver;
	Test_Reader tr;

	//String Browser = "Chrome";

	public void openApplication() {
	 tr= new Test_Reader();
		String Browser= tr.readBrowser();
		
		if (Browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (Browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("We do not have this Browser");

		}
String QAEUrl= tr.readurl();
		driver.get(QAEUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public void closeApplciation() {
		if (driver != null)
			driver.quit();

	}

}
