import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ExcelData {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();	

		FileInputStream fis=new FileInputStream("./FileData10.properties");
		//FileInputStream fis=new FileInputStream("C:\\Users\\Shobha\\Documents\\FileData10.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url1");

	}

}
