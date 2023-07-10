package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathLocator {

	public static void main(String[] args) {
	
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.xpath("//input[@placeholder='Username' and @name='username']")).sendKeys("admin");
driver.findElement(By.xpath("//input[@type='password' and @placeholder='Password']")).sendKeys("manager");
driver.findElement(By.xpath("//a[@id='loginButton' or @class='initial']")).click();

//driver.findElement(By.cssSelector("a.task")).click();
	}

}
