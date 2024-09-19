package keyWorkDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test_Reader {

	Properties pro;
	
	
	public  Test_Reader () {
		 pro=new Properties();
		String FilePath= "src/test/resources/Test.Properties";
		
		FileInputStream fis;
		try {
			fis= new FileInputStream(FilePath);
			pro.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public String readBrowser() {
		return pro.getProperty("Browser");
	}
	public String readurl() {
		return pro.getProperty("Url");
	}
	public String email1() {
		return pro.getProperty("Email");
		
	}
	public String Remail1() {
		return pro.getProperty("R_email");
		
	}
	public String fNmae() {
		return pro.getProperty("Fname");
		
	}
	public String Mname() {
		return pro.getProperty("Mname");
		
	}
	public String Lname() {
		return pro.getProperty("lname");
		
	}
	
}
