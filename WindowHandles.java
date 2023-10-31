package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> setdata=driver.getWindowHandles();
		List<String> listdata=new ArrayList<String>(setdata);
		driver.switchTo().window(listdata.get(1));
		System.out.println("Title of the newly opened window:"+driver.getTitle());
		driver.close();
		Set<String> allWindowHandles = driver. getWindowHandles(); 
		System.out.println("The original Window:"+allWindowHandles);
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
