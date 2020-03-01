import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	driver.get("https://www.google.com/");
    	driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("USS MAME venkiiiiiiiiiiiiiii");

	}

}
