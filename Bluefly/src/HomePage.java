import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	FirefoxDriver dr;
	@FindBy(how = How.XPATH, using=".//*[@id='main-nav-men']/a")
	WebElement theMenLink;
	
	
	HomePage(FirefoxDriver dr)
	{
		this.dr = dr;
		PageFactory.initElements(dr, this);;
	}
		void verifyTitle()
		{
			System.out.println(dr.getTitle().contains(""));
			
		}
		MenPage ClickMenLink()
		{
			theMenLink.click();
			return new MenPage(dr);
		}
	

}
