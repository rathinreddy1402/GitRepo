package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	public static void main(String[] args) throws Throwable {
		
		 WebDriver driver=new EdgeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
driver.findElement(By.xpath("//button[text()='✕']")).click();
WebElement data = driver.findElement(By.name("q"));
data.sendKeys("iphone13");
data.submit();
Thread.sleep(1000);

//getText()
/*WebElement data1 = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']"
		+ "/ancestor::div[@class='_3pLy-c row']"
		+ "/descendant::div[text()='₹61,999']"));
String value = data1.getText();
System.out.println(value);*/

//click()
WebElement action = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']"));
action.click();

	}

}
