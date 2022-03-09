import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fileDownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//befor//New folder//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mca.gov.in/MinistryV2/companyformsdownload.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Form CRL-1 [zip] (115 KB)')]"));
		
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		element.click();
		Thread.sleep(5000);
		
		File fl = new File("C:\\Users\\befor\\Downloads\\Form_CRL1.zip");
		
		if(fl.exists())
		{
			System.out.println("File present");
		}
		else
		{
			System.out.println("File not Present");
		}
		

	}

}
