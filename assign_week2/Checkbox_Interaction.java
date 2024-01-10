package assign_week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Interaction {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		String text = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		System.out.println(text);
		//click anyone language verify is displayed msg or not
		System.out.println(driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed());
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		
		
		/*WebElement triState= driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']"));
		boolean selected = triState.isSelected();
		System.out.println(selected);*/
		
		// click tristate checkbox and isselected or not 
		
		driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']")).click();
		
		 WebElement triState=driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']"));
		 System.out.println("TriSTate checkbox:" + triState.isSelected());
		//click toggle switch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
				  
		
		
		//verify if disabled or not
		WebElement disabled = driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]"));
	    boolean enabled = disabled.isEnabled();
		System.out.println("verify if it is Disabled or not: " +enabled);
		
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
		
		
	
		//select multiple
		
		driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[1]/div[1]/div[2]")).click();
		
		WebElement SelectMultiple = driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[1]/div[1]/div[2]"));
	     boolean selected = SelectMultiple.isSelected();
		 System.out.println(" select all option :" +selected );
		
				
		
		
		
		driver.close();
		
		
		
	}
}
