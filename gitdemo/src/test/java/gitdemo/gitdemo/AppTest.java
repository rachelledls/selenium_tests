package gitdemo.gitdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {
	
		protected WebDriver driver;
		
		@Test
		public void gitTutorial() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\RPD001\\Desktop\\Selenium\\chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			String eTitle = "Google";
			String aTitle = "";
			
			driver.get("http://google.com");
			driver.manage().window().maximize();
			aTitle = driver.getTitle();
			//compare the actual title with the expected title
			if(aTitle.contentEquals(eTitle)) {
				System.out.println("Test Passed");
			} else {
				System.out.println("Test Failed");
			}
			
			System.out.println("Test 1");
			driver.close();
		}
	
}
    