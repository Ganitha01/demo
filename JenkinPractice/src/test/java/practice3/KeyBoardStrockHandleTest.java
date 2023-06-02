package practice3;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyBoardStrockHandleTest {
	@Test
	public void loingToActitime() throws Exception
	{
		
//	PropertyFileUtility putil=new ProperyFileUtility();
//	String USERNAME=putil.readDataFromPropertyFile("username");
//	String PASSWORD=putil.readDataFromPropertyFile("password1");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("----chrome launched successfully------");
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		WebElement srcelement=driver.findElement(By.xpath("//div[text()='Oslo'][2]"));
		System.out.println(srcelement.getRect());
		Actions act=new Actions(driver);
		WebElement dstelemet=driver.findElement(By.xpath("//div[text()='Spain']"));
		act.dragAndDrop(srcelement, dstelemet).perform();
	
	driver.quit();
		
		/**
		 * with the help of Keys class
		 */
		/*driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.xpath("//input[contains(@class,'pwdfield')]")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		Robot rb=new Robot();
	WebElement element=driver.findElement(By.xpath("//button[text()='Apr 03 - Apr 09, 2023']"));
	Actions act=new Actions(driver);
	act.moveToElement(element).click().perform();
	/*rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_A);
	rb.keyRelease(KeyEvent.VK_A);
	rb.keyPress(KeyEvent.VK_C);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_C);
	rb.keyPress(KeyEvent.VK_TAB);
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);*/
	
	
		
		
		
		
	}
}
