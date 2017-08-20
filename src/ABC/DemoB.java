package ABC;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoB extends Basetest{
	@DataProvider
	public String[][] getdata(){
		String[][] data=new String[2][2];
		data[0][0]="userA";
		data[0][1]="A";
		data[1][0]="userB";
		data[1][1]="B";
		return data;
	}
@Test(dataProvider="getdata")
public void testC(String un,String pw){
		Reporter.log("Create UN:"+un+  "With PW:"+pw,true);
}
}
