package FrameWork;

import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchApp {

	public static void main(String[] args) throws Throwable {
		
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();	

FileInputStream fis=new FileInputStream("./FileData10.properties");
//FileInputStream fis=new FileInputStream("C:\\Users\\Shobha\\Documents\\FileData10.properties");
Properties pro=new Properties();
pro.load(fis);
String URL = pro.getProperty("url");
String USERNAME = pro.getProperty("username");
String PASSWORD = pro.getProperty("password");
       
        driver.get(URL);
       
        LoginPage log=new LoginPage(driver);
       
        
//       driver.findElement(By.id("username")).sendKeys(USERNAME);
//        driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
//        driver.findElement(By.id("loginButton")).click();
	}

}
