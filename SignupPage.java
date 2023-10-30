package Task16;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SignupPage {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.guvi.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("name")).sendKeys("Anbu");
		//driver.findElement(By.id("lastName")).sendKeys("R");
		driver.findElement(By.id("email")).sendKeys("anbusam515@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Anbu@123456");
		driver.findElement(By.id("mobileNumber")).sendKeys("9876543185");
		driver.findElement(By.id("signup-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='May be later']")).click();
		String actual = driver.getTitle();
		System.out.println(actual);		 
		String excepted = "Sign";
		if(actual.contains(excepted)) {
			System.out.println("Registered sucessfully");}
			else {
				System.out.println("Registration is unsucessful");
			}
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File source = scrShot.getScreenshotAs(OutputType.FILE);
		File destination= new File("snap/signup.png");
		FileUtils.copyFile(source, destination);
		
         driver.close();
			
		}


	}


