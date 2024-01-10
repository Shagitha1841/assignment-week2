package assign_week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Edit_Lead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//enter the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	    //enter the pw
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	    //click login
	    driver.findElement(By.xpath("//input[contains(@class,'decorativeSubmit')]")).click();
	    //click CRM/SFA
	    driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	    //click leads
	    driver.findElement(By.xpath("//a[text()='Leads']")).click();
	    //click create lead
	    driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	    //company name
	    driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Amazon");
		//firstname
	    driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Shahitha");
	    //lastname
	    driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("afshan");
	    //enter first name local
	    driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("shahith");
	    //enter department
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("DevOPs");
	    //enter Description
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("create lead ");
	    //enter email
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shahitha165@gmail.com");
	    //select state province
	    WebElement Statedd = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select sel = new Select(Statedd);
	    sel.selectByVisibleText("New York");
	    //click create button
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    //click edit button
	    driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		/*
		 * //clear Description
		 * driver.findElement(By.id("createLeadForm_description")).clear();
		 */
	    //sendkeys important note
	    driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("create lead");
	    //click update button
	    driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
	    //getTitle of resulting page
	    String title2 = driver.getTitle();
	    System.out.println(title2);
	    
	    driver.close();
	}

}
