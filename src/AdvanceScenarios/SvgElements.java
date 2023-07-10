package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SvgElements {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
driver.findElement(By.xpath("//*[name()='svg' and @class='gb_g']")).click();

	}
}
