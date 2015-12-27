import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MenPage {
	FirefoxDriver dr;
	MenPage(FirefoxDriver dr)
	{
		this.dr = dr;
		
	}
	void verifyman()
	{
		System.out.println(dr.getTitle().contains("him"));
	}
	Women clickwomen()
	{
		dr.findElement(By.xpath("")).click();
		return new Women(dr);
	}


}
