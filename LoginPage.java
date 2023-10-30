package Task16;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.guvi.in/sign-in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("anbusam515@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Anbu@123456");
		driver.findElement(By.xpath("//a[@id='login-btn']")).click();
		String actual1 = driver.getTitle();
		System.out.println(actual1);		 
		String excepted1 = "Login";
		if(actual1.contains(excepted1)) {
			System.out.println("Logged in sucessfully");}
			else {
				System.out.println("Login is unsucessful");
			}
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File source = scrShot.getScreenshotAs(OutputType.FILE);
		File destination= new File("snap/Login.png");
		FileUtils.copyFile(source, destination);
		
         driver.close();
			
	}

}
