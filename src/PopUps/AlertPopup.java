package PopUps;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopup {

	public static void main(String[] args) {
WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
        driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
	driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
	driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
	driver.findElement(By.name("name")).sendKeys("qspiders");
	driver.findElement(By.xpath("//input[contains(@value,' Cancel')]")).click();
	
	Alert alt = driver.switchTo().alert();
	//alt.accept();
	alt.dismiss();
	}
	}
