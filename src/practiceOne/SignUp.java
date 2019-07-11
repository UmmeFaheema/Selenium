package practiceOne;

import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Faheema\\Desktop\\chrome_driver\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver chrome1 = new ChromeDriver();
		String homepage1 = "https://www.google.com/";
		
		chrome1.get(homepage1);
		chrome1.manage().window().maximize();
		chrome1.get("https://www.demo.iscripts.com/multicart/demo/index.php");
		chrome1.findElementByXPath("//*[@id=\"dLabellogin\"]/span").click();
		chrome1.findElementByXPath("//*[@id=\"jqSignup\"]").click();
		Thread.sleep(4000);
		
		chrome1.findElementByXPath("//*[@id=\"txtEmail\"]").sendKeys("faheema123@gmail.com");
		chrome1.findElementByXPath("//*[@id=\"txtUserName\"]").sendKeys("faheema123");
		chrome1.findElementByXPath("//*[@id=\"txtPassword\"]").sendKeys("faheema1");
		chrome1.findElementByXPath("//*[@id=\"txtCnfPassword\"]").sendKeys("faheema1");
		chrome1.findElementByXPath("//*[@id=\"txtFirstName\"]").sendKeys("umme");
		chrome1.findElementByXPath("//*[@id=\"txtLastName\"]").sendKeys("faheema");
		chrome1.findElementByXPath("//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[7]/input").sendKeys("111 peachtree rd");
		chrome1.findElementByXPath("//*[@id=\"btnRegister\"]").click();
		
		Thread.sleep(4000);
		
		chrome1.findElementByXPath("//*[@id=\"dLabel\"]/span");
		
		
		
		chrome1.close();		
		
	}

}
