package ScrollUpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_ScrollUpDown 
{
	

	

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s?rh=n%3A20538600031&language=en_IN&brr=1&rd=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement wb =driver.findElement(By.xpath("//a[text()='Help']"));
		((JavascriptExecutor)driver).executeAsyncScript("arguments[0].scrollIntoView(true);", wb);
		
	}

}
