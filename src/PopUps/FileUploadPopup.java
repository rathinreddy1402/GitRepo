package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.monsterindia.com/");
driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
	driver.findElement(By.xpath("//input[@name='file']")).sendKeys("C:\\Users\\Shobha\\Desktop\\ExtentReport.txt");
	
	}

}
