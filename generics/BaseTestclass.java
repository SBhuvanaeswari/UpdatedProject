package Com.UIIC.generics;




import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;



abstract public class BaseTestclass implements IAutoConstant

{
	static
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		System.setProperty(IE_KEY,IE_VALUE);

		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.iedriver().setup();
	}
	
	public static WebDriverWait wait;
	 public static int passCount=0,failCount=0;
	public static   WebDriver driver;
	@BeforeClass
	
    @Parameters("browser")
	public void browser(String browser)
	{
		if(browser.equals("chrome"))
		{  
			
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
		
			driver=new FirefoxDriver();
		}
		else if(browser.equals("ie"))
		{
			
			driver=new InternetExplorerDriver();
		}

		
	}
	@BeforeMethod
	public void openApp()
	{
		driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PLTO,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver,30);
		driver.get(URL);
		
	}
	
	@AfterMethod

	public void closeAppBrower(ITestResult res)
	{   
		
		String testname = res.getName();
		Date d = new Date();
		String screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		
		int status = res.getStatus();
		if(status==1)
		{
			passCount++;
			System.out.println("PassCount is===="+passCount);
			String photo=PHOTO_PATH+"Passed TestCases_"+testname+screenshotName;
			FWUtills.takeScreenShot(driver,photo);
		}
		else if(status==2)
		{
			failCount++;
			System.out.println("FailCount is===="+failCount);
			String photo=PHOTO_PATH+"Failed_"+testname+screenshotName;
			FWUtills.takeScreenShot(driver,photo);
		}

		//driver.quit();	
		}

}
