package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_Switch_To_Child_Window 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on "NewTab" from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		//get child window ID
		Set<String> allIds = driver.getWindowHandles();
		//{mainPageID, childWindowID}
		ArrayList<String> al=new ArrayList<String>(allIds);
		//{mainPageID(0), childWindowID(1)}
		String childWindoewID = al.get(1);
		//switch to child window
		driver.switchTo().window(childWindoewID); //String childWindowID
		//click on "Training" link from childWindow
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click(
		);
	}

}
