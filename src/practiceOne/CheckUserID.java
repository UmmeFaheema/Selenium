package practiceOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckUserID {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Faheema\\Desktop\\chrome_driver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver chrome1 = new ChromeDriver();
		String homePage1 = "https://www.google.com/";
		
		chrome1.get(homePage1);
		chrome1.manage().window().maximize();
		chrome1.get("https://www.demo.iscripts.com/multicart/demo/index.php");
		chrome1.findElementByXPath("//*[@id=\"dLabellogin\"]/span").click();
		chrome1.findElementByXPath("//*[@id=\"username\"]").sendKeys("user10");
		chrome1.findElementByXPath("//*[@id=\"password\"]").sendKeys("pass10");
		chrome1.findElementById("jqLogin").click();
		Thread.sleep(5000);
		
		WebElement name = chrome1.findElementByXPath("//*[@id=\"dLabellogin\"]/span");
		
		if(name.toString().equalsIgnoreCase("HOT MAN")) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		
		
		
		chrome1.quit();
	
		
	}

}
