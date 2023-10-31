package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		 List<WebElement> frames1=driver.findElements(By.tagName("frame"));
		 System.out.println( "No.of frames on the page:"+frames1.size());
	 WebElement ele=driver.findElement(By.xpath("//frame[@name=\"frame-left\"]"));
	 driver.switchTo().frame(ele);
	 WebElement body = driver.findElement(By.cssSelector("body"));
		System.out.println(body.getText());
		// driver.switchTo().frame(driver.findElement(By.name("frame-top")));
	//Thread.sleep(3000);
	WebElement ele1=driver.findElement(By.xpath("//frame[@name=\"frame-middle\"]"));
	driver.switchTo().frame(ele1);
	WebElement body1 = driver.findElement(By.cssSelector("body"));
	System.out.println(body1.getText());
	WebElement ele2=driver.findElement(By.xpath("//frame[@name=\"frame-right\"]"));
    driver.switchTo().frame(ele2);
    WebElement body2 = driver.findElement(By.cssSelector("body"));
	System.out.println(body2.getText());
	WebElement ele3=driver.findElement(By.xpath("//frame[@name=\"frame-bottom\"]"));
	driver.switchTo().frame(ele3);
	WebElement body3 = driver.findElement(By.cssSelector("body"));
	System.out.println(body3.getText());
	}

}
	 	 