package assign_week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Interaction {

	public static void main(String[] args) {
		
		ChromeDriver face = new ChromeDriver();
		
		face.get("https://en-gb.facebook.com/");
		
		face.manage().window().maximize();
		
		face.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		face.findElement(By.linkText("Create new account")).click();
		
		face.findElement(By.name("firstname")).sendKeys("ShahithaAfshan");
		
		face.findElement(By.name("lastname")).sendKeys("RajaMohamed");
		
		face.findElement(By.name("reg_email__")).sendKeys("Shahitha184@gmail.com");
		
		face.findElement(By.name("reg_email_confirmation__")).sendKeys("Shahitha184@gmail.com");
		
		face.findElement(By.id("password_step_input")).sendKeys("Sh@hith@184");
		
		face.findElement(By.id("day"));
		
		WebElement Daydd = face.findElement(By.id("day"));
		
		Select day = new Select(Daydd);
		
		day.selectByIndex(18);
		
		face.findElement(By.id("month"));
		
		WebElement monthDD = face.findElement(By.id("month"));
		
		Select month = new Select(monthDD);
		
		month.selectByValue("4");
		
		face.findElement(By.id("year"));
		
		WebElement yearDD = face.findElement(By.id("year"));
		
		Select year = new Select(yearDD );
		
		year.selectByVisibleText("2001");
		
		face.findElement(By.linkText("Female")).click();
		
		//face.findElement(By.name("sex")).click();
		
		//face.findElement(By.name("sex")).click();		
		
		face.close();

	}

}
