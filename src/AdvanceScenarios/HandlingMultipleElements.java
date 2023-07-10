package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingMultipleElements {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//button[text()='✕']")).click();

 List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	
	int count=0;//1
	for( WebElement webEle:allLinks)
	{
		System.out.println(webEle.getText());//1
		count++;
	}
	System.out.println("total no of links:"+count);
	}
}
