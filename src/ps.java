import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ps {

	@BeforeMethod
	public void before() {
		System.out.println("Run me first");
	}
	
public void doThis()
{
	System.out.println("I am here");
}
	@AfterMethod
	public void After() {
		System.out.println("Run me Last");
	}
}

	


