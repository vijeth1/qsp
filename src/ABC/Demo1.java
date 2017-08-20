package ABC;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
@Test
public void login(){
	Reporter.log("login",true);
}
@Test(dependsOnMethods="login")
public void createuser(){
	Reporter.log("createuser",true);
}
}
