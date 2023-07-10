package PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BrowserNativePopup {

	public static void main(String[] args) {
		/*EdgeOptions option = new EdgeOptions();
		option.addArguments("InPrivate");
		WebDriver driver = new EdgeDriver(option);
		driver.manage().window().maximize();*/
	
		
		ChromeOptions option = new ChromeOptions();
			option.addArguments("incognito");
			WebDriver driver=new ChromeDriver(option);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.yatra.com");
}

}
