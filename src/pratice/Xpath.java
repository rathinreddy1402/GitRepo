package pratice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath {

	public static void main(String[] args) throws Throwable {
		
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();
	/*	driver.get("https://demo.actitime.com/login.do");
       driver.manage().window().maximize();
		// xpath by Attribute
		//      //htmltag[@AttributeName='AttributeValue']
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	
		//  xpath by visible Text
		//    //htmltag[text()='visibleText']
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Lock Time-Track']")).click();*/

/*driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//button[text()='✕']")).click();
driver.findElement(By.xpath("//div[text()='Mobiles']")).click();*/
driver.get("https://demo.actitime.com/login.do");
     //xpath contains AttributeValue
//     //htmltag[contains(@AttributeName,'AttributeValue')]
driver.findElement(By.xpath("//input[contains(@name,'us')]")).sendKeys("admin");
driver.findElement(By.xpath("//input[contains(@class,'p')]")).sendKeys("manager");

//xpath by visibleText
driver.findElement(By.xpath("//div[text()='Login ']")).click();
Thread.sleep(1000);
//xpath contains visibleText
//     //htmltag[contains(text(),'AttributeValue')]
driver.findElement(By.xpath("//*[.='View Time-Track']")).click();
	}
}   
