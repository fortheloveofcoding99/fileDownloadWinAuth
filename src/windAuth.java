import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//befor//New folder//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
		
	}

}
