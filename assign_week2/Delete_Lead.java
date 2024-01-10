package assign_week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_Lead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d_lead = new ChromeDriver();
		
		d_lead.get("http://leaftaps.com/opentaps/");
		String title = d_lead.getTitle();
		System.out.println(title);
		
	    d_lead.manage().window().maximize();
	    d_lead.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    //enter the username
	    d_lead.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	    //enter the pw
	    d_lead.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	    //click login
	    d_lead.findElement(By.xpath("//input[contains(@class,'decorativeSubmit')]")).click();
	    //click CRM/SFA
	    d_lead.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	    //click Leads
	    d_lead.findElement(By.xpath("//a[text()='Leads']")).click();
	    //click findLeads
	    d_lead.findElement(By.xpath("//a[text()='Find Leads']")).click();
	    //click phone-tab
	    d_lead.findElement(By.xpath("//span[text()='Phone']")).click();
	    //enter the phone country codenumber
	    d_lead.findElement(By.name("phoneCountryCode")).sendKeys("91");
	    //enter the phone area code
	    d_lead.findElement(By.name("phoneAreaCode")).sendKeys("121");
	    //enter the phone number
	   d_lead.findElement(By.name("phoneNumber")).sendKeys("9658724532");
	   //click find leads
	   d_lead.findElement(By.xpath("//table[@id='ext-gen242']")).click();
	   
	   d_lead.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	   
		String leadID = d_lead.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(leadID);
		
		d_lead.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		d_lead.findElement(By.linkText("Delete")).click();
		d_lead.findElement(By.linkText("Find Leads")).click();
		d_lead.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		d_lead.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = d_lead.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Lead deleted successfully");
		} else {
			System.out.println("Lead is not deleted ");
		}
		d_lead.close();
		 
		/*
		 * d_lead.findElement(By.xpath("(//a[@class='linktext'])[4]")).click(); //delete
		 * lead d_lead.findElement(By.xpath("//a[text()='Delete']")).click(); //click
		 * findLeads d_lead.findElement(By.xpath("//a[text()='Find Leads']")).click();
		 */
	   
	
		 
	    
	
	}

}
