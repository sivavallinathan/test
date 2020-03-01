package GradleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	driver.get("http://leaftaps.com/opentaps/control/main");
    	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
    	driver.findElement(By.id("password")).sendKeys("crmsfa");
    	driver.findElement(By.className("decorativeSubmit")).click();
    	driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
    	driver.findElement(By.linkText("Marketing")).click();
    	driver.findElement(By.linkText("Create Campaign")).click();
    	driver.findElement(By.id("createMarketingCampaignForm_campaignName")).sendKeys("siva");
    	driver.findElement(By.id("createMarketingCampaignForm_fromDate")).sendKeys("03/12/20");
    	WebElement hour=driver.findElement(By.name("fromDate_c_hour"));
    	WebElement min=driver.findElement(By.name("fromDate_c_minutes"));
    	WebElement ampm=driver.findElement(By.name("fromDate_c_ampm"));
    	Select hr=new Select(hour);
    	Select mi=new Select(min);
    	Select ap=new Select(ampm);
    	hr.selectByVisibleText("9");
    	mi.selectByVisibleText("56");
    	ap.selectByVisibleText("PM");
    	
    	

	}

}

