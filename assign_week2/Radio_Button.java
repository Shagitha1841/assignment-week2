package assign_week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//click the favourite browser
		driver.findElement(By.xpath("(//label[text()='Safari'])[1]")).click();
		//click the unselected option
		driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();
		// click again the unselected option
		driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();
		//verify unselected
		boolean enabled = driver.findElement(By.xpath("//label[text()='Bengaluru']")).isEnabled();
        System.out.println(enabled);
        //verify unselected
        boolean selected =driver.findElement(By.xpath("//label[text()='Bengaluru']")).isSelected();
        System.out.println(selected);
        //radio button selected by default
        boolean defaultSel=driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isSelected();
        System.out.println(defaultSel);
        //radio button selected by default
        boolean fireFox = driver.findElement(By.xpath("(//label[text()='Firefox'])[2]")).isSelected();
        System.out.println(fireFox);
        //selected radio button ony if not selected
        boolean ageSel=  driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected();
        System.out.println(ageSel);
        //close the browser
        driver.close();
       
        
	}

	
}
