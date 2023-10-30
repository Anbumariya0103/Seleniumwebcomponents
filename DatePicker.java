package Task16;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// //Initialization and Launch the browser
WebDriver driver=new ChromeDriver();
		//  Load the respective URL
driver.navigate().to("https://jqueryui.com/datepicker/");
		// this step is used too manage the window to maximize
driver.manage().window().maximize();
		//wait is added to prevent from the exception
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// switch to frame to access the datepicker
driver.switchTo().frame(0);
		////Located the textbox by using the locator xpath and then click action is done
driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
		// Located the calender and clicked on next arrow 
driver.findElement(By.xpath("//span[text()='Next']")).click();
		// Located the respective date
  WebElement date=driver.findElement(By.xpath("//a[@data-date='22']"));
		// clicked the respective date
  date.click();
		// printed the date on the  console
 System.out.println(date.getText());

	}

}
