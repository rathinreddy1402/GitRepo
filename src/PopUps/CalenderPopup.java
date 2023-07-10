package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CalenderPopup {

	public static void main(String[] args) {
			WebDriver driver=new EdgeDriver();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	 driver.get("https://www.makemytrip.com/");
     driver.findElement(By.xpath("//span[text()='Departure']")).click();
     
     driver.findElement(By.xpath("//div[text()='May 2023']"
     		+ "/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='10']")).click();
	}

}
