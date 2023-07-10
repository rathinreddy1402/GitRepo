package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelector {

	public static void main(String[] args) {
	
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
        driver.manage().window().maximize();
        
        //using cssSelector() by id()
        //    [AttributeNAme='AttributeValue']
		//driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");

        //     htmltag[AttributeName='AttributeValue']
		//driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		
        //shortcut
        driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		
		//using cssSelector() by className()
		 //    [AttributeNAme='AttributeValue']
	//driver.findElement(By.cssSelector("[class='textField pwdfield']")).sendKeys("manager");
	
	//	htmltag[AttributeName='AttributeValue']
	//driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
	
        driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager");
	driver.findElement(By.cssSelector("#loginButton")).click();
	}

}
