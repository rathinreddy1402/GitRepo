package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSugg {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
	/*	//List<WebElement> suggestion = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
driver.findElement(By.xpath("//div[@class='autocomplete-results-container']/child::div"));*/
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bluetooth",Keys.ENTER);
	}

}
