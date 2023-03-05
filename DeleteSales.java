package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DeleteSales {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubWebDriver driver=new ChromeDriver();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
        WebElement menu = driver.findElement(By.xpath("(//button[@type='button'])[7]"));
		menu.click();
        WebElement viewall = driver.findElement(By.xpath("//button[text()='View All']"));
		viewall.click();
        WebElement opt = driver.findElement(By.xpath("//input[@class='slds-input']"));
		opt.sendKeys("dashboard");
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search recent dashboards...']"));
		search.sendKeys("Automated by DHARANI");
		Thread.sleep(10000);
		WebElement delete = driver.findElement(By.xpath("(//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small'])[1]//following::lightning-primitive-icon"));
		Actions button=new Actions(driver);
		button.moveToElement(delete).perform();
		delete.click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("(//span[text()='Delete'])[2]")).click();
	}

}
