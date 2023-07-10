package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EdgeBrowser {

	public static void main(String[] args) throws Throwable {
	//Launching empty edge browser
	//	WebDriver driver=new EdgeDriver();
		
	/*	String key="webdriver.edge.driver";
		String value="C:\\Users\\Shobha\\Downloads\\edgedriver_win64 (6)\\msedgedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new EdgeDriver();
		
		//This method is used for Launching Application
	driver.get("https://www.flipkart.com/");
	//driver.get("https://www.amazon.in/");
	
	//This Method is used to get the title of the Webpage
     String data = driver.getTitle();
      System.out.println(data);
      
      driver.get("https://www.amazon.in/");
      String data1 = driver.getTitle();
      System.out.println(data1);*/
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().fullscreen();
		//String code = driver.getPageSource();
		//System.out.println(code);
		
		//fetches current url of the application
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		//closes current focusing tab(one tab)
		driver.close();
		
		//Closes all the tabs
		//driver.quit();
		
	}}
