package practiceOne;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCheck {

	public static void main(String[] args) throws InterruptedException {
		//Given I go to https://www.demo.iscripts.com/multicart/demo/index.php
				//And I click the Login link
				//then I enter my ID and password
				//then I validate I am logged in
				
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Faheema\\Desktop\\chrome_driver\\chromedriver_win32\\chromedriver.exe");

				
				//Open Chrome Browser
				
				ChromeDriver mychrome = new ChromeDriver();
				
				
				//Go to a website https://www.demo.iscripts.com/multicart/demo/index.php
				mychrome.get("https://www.demo.iscripts.com/multicart/demo/index.php");
				
				
				
				//Click the login button
				mychrome.findElement(By.xpath("//*[@id=\"dLabellogin\"]/span")).click();
				
				
				
				//EnterID and password
				mychrome.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("user");
				mychrome.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
				
				
				//Click the login button
				mychrome.findElement(By.xpath("//*[@id=\"jqLogin\"]")).click();
				
				//Wait some time for Login Happen
				try {
				Thread.sleep(1000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			
				
				
				//Check the user is Mr James William
				
				String expecteduser = "James Williams";
				String actualUserName = mychrome.findElement(By.xpath("//*[@id=\"dLabel\"]/span")).getText();
				
				if(expecteduser.equalsIgnoreCase(actualUserName)) {
					System.out.println("Test Passed");
					
				}
				else {
					System.out.println("Test Failed");
				}
				
				
				
				mychrome.close();

	}

}
