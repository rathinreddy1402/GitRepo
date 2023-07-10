package PopUps;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowPop {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		String data = driver.getTitle();
		System.out.println(data);
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
	driver.findElement(By.xpath("//button[.='click']")).click();
	
  //  String win = driver.getWindowHandle();
	Set<String> windows = driver.getWindowHandles();
	
	for(String window:windows)
	{
		driver.switchTo().window(window);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Selenium"))
		{
			break;
		}
	}
	driver.findElement(By.xpath("//a[text()='Watch the Videos']")).click();
	Thread.sleep(2000);
Set<String> windowss = driver.getWindowHandles();
	
	for(String window:windowss)
	{
		driver.switchTo().window(window);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Frames & windows"))
		{
			break;
		}
	}
	
	
	}

}
