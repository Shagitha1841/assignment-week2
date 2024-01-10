package assign_week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground_Button {

	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://leafground.com/button.xhtml ");
		 String title = driver.getTitle();
		 System.out.println("Main Page : "+title);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 //click the button click and confirm title
		 driver.findElement(By.xpath("//span[text()='Click']")).click();
		 //verify the title of the page Dashboard
		 String titleDash = driver.getTitle();
		 System.out.println("the title of the page is: " +titleDash);
		 //to navigate the main page
		 driver.navigate().back();
		 //chech ifthe button is Disabled button or not
		 WebElement disabledbtn = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']"));
		 boolean enabled = disabledbtn.isEnabled();
		 System.out.println(enabled );
			/*
			 * //find the position of submit button
			 * driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).
			 * getLocation().getX();
			 */
		 //find the position of submit button
		 WebElement submitposition = driver.findElement(By.id("j_idt88:j_idt94"));
		 Point location = submitposition.getLocation();
		 System.out.println("position of submit button: " +location);
		 //find the color of save button
		 WebElement saveclr = driver.findElement(By.id("j_idt88:j_idt96"));
		 String cssValue = saveclr.getCssValue("background");
		 System.out.println("Color of Save button : "+cssValue);
		 
		 //find the height and width of the button
		WebElement sizebtn= driver.findElement(By.id("j_idt88:j_idt98"));
		Dimension size = sizebtn.getSize();
		System.out.println("size of the button :"+size);
		System.out.println("Height of the button: "+size.getHeight());
		System.out.println("Width of the button: "+size.getWidth());
		//close the browser
		driver.close();
	}

}
