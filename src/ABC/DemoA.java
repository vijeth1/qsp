package ABC;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA extends Basetest{
@Test(priority=2)
public void testA(){
	Reporter.log("testA", true);
}
	@Test(priority=1,invocationCount=2)
	public void testB(){
		Reporter.log("testB", true);
	}

}
