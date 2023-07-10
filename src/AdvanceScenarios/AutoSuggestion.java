package AdvanceScenarios;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws Throwable {
	
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("bluetooth");
		
		Thread.sleep(2000);
		
		List<WebElement> allList = driver.findElements(By.tagName("li"));
		for(WebElement list:allList)
		{
			if(list.getText().contains(" earbuds"))
			{
				System.out.println(list.getText());
				Thread.sleep(1000);
				list.click();
				break;
			}
		}

	}

}
