package Task16;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://jqueryui.com/datepicker/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.switchTo().frame(0);
driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
driver.findElement(By.xpath("//span[text()='Next']")).click();
  WebElement date=driver.findElement(By.xpath("//a[@data-date='22']"));
  date.click();
 System.out.println(date.getText());

	}

}
