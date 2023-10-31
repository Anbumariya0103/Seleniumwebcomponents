package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://the-internet.herokuapp.com/iframe");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.switchTo().frame("mce_0_ifr");
//driver.switchTo().frame("//iframe[@id='mce_0_ifr']");
driver.findElement(By.xpath("//p[text()='Your content goes here.']")).sendKeys("Hello People");
driver.close();


	}

}
