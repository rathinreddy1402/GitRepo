package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassEx {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new EdgeDriver();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
		Thread.sleep(1000);

WebElement dateList = driver.findElement(By.id("day"));
	Select sel=new Select(dateList);
    sel.selectByIndex(0);
	sel.selectByValue("20");
	sel.selectByVisibleText("10");
	
	WebElement monthList = driver.findElement(By.id("month"));
	Select sele=new Select(monthList);
	//sele.selectByIndex(2);
	//sele.selectByValue("2");
	sele.selectByVisibleText("May");
	
	WebElement yearList = driver.findElement(By.id("year"));
	Select selec=new Select(yearList);
	selec.selectByIndex(0);
	}

}