import org.junit.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

public class Women extends LoadableComponent<Women>
{   FirefoxDriver dr;
	Women(FirefoxDriver dr)
	{
		this.dr = dr;
	}
	void verifyText()
	{
		System.out.println(dr.getPageSource().contains("shahid"));
	}
	
	@SuppressWarnings("deprecation")
	@Override
	protected void isLoaded() throws Error {
	Assert.assertTrue(dr.getCurrentUrl().equals("http://www.bluefly.com/a/women-clothing"));	
		System.out.println(dr.getPageSource().contains("shahid"));
	}
	@Override
	protected void load() {
		
	dr.get("http://www.bluefly.com/a/women-clothing");	
	System.out.println("load");
	System.out.println(dr.getPageSource().contains("shahid"));
		
	}

}
