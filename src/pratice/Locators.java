package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.actitime.com/login.do");

		 //using id locator
		driver.findElement(By.id("username")).sendKeys("admin");
		
		//driver.findElement(By.className("textField")).sendKeys("admin");
		
		//using name locator
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//driver.findElement(By.className("textField pwdfield")).sendKeys("manager");
		//driver.findElement(By.className("textField")).sendKeys("manager");
		
		//using id locator
		//driver.findElement(By.id("loginButton")).click();
		
		//using className locator
		//driver.findElement(By.className("initial")).click();
		
		//using linktext locator
		Thread.sleep(1000);
		//driver.findElement(By.linkText("Enter Time-Track")).click();
		
		//using partialLinktext
		//driver.findElement(By.partialLinkText("View T")).click();
		
	}

}
