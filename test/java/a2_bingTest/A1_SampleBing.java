package a2_bingTest;

public class A1_SampleBing{

	import java.io.File;
import java.util.logging.FileHandler;

import org.testng.annotations.Test;
@Test
	
		public  void loginBingTest() {
			
			WebDriverManager.chromedriver().setup();
			WebDriver wd=new ChromeDriver;
			wd.get("https://www.bing.com/");
            System.out.println(wd.getTitle());
			WebElement element =wd.findElement(By.name("q"));
			element.sendKeys("chennai");
			element.submit();
            System.out.println(wd.getTitle());
			wd.navigate().back();
            System.out.println(wd.getTitle());
			wd.navigate().forward();
			System.out.println(wd.getTitle());
			File src =((TakesScreenshot)wd.getScreenshotAs(OutputType.File));
			FileHandler.copy(src,new File("C:/vcentryWorkspace/batch261/K3_GitTest/screenshot/bing.png"));
			wd.quit();
			

		}

}

}
