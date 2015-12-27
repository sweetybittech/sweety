import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
FirefoxDriver dr;
@Before
public void start() throws InterruptedException
{
	dr = new FirefoxDriver();
	dr.get("http://www.bluefly.com");
	dr.manage().window().maximize();
	dr.navigate().refresh();
	//Thread.sleep(2000);
	//dr.quit();
	
}

}
