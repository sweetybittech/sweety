import org.junit.Test;

public class SmokeTest extends BaseTest
{	

@Test
	public void m1()
	{
		HomePage hp = new HomePage(dr);
		hp.verifyTitle();
		MenPage mp = hp.ClickMenLink();
		
	}
public void m2()
{
	
}

}
