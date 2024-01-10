package assign_week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Account_Creation {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("shahitha Afshan");
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		driver.findElement(By.name("industryEnumId"));
		
	    WebElement industryDD = driver.findElement(By.name("industryEnumId"));
	    
	    Select obj = new Select(industryDD);
	    
	    obj.selectByVisibleText("Computer Software");
	    
	    driver.findElement(By.name("ownershipEnumId"));
	    
	    WebElement  ownershipDD = driver.findElement(By.name("ownershipEnumId"));
	    
	    Select obj1 = new Select(ownershipDD );
	    
	    obj1.selectByVisibleText("S-Corporation");
	    
	    driver.findElement(By.id("dataSourceId"));
	    
	    WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
	    
	    Select obj2 = new Select(sourceDD);
	    
	    obj2.selectByValue("LEAD_EMPLOYEE");
	    
	    driver.findElement(By.id("marketingCampaignId"));
	    
	    WebElement marketDD = driver.findElement(By.id("marketingCampaignId"));
	    
	    Select obj3 = new Select(marketDD);
	    
	    obj3.selectByIndex(6);
	    
	    driver.findElement(By.id("generalStateProvinceGeoId"));
	    
	    WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
	    
	    Select obj4 = new Select(stateDD);
	    
	    obj4.selectByValue("TX");
	    
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    driver.close();
	    
		
	}
}

	


