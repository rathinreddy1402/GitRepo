package PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//driver.get("https://username:password@Url);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
