package testngCode_12thNov2022_12thClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Concept {
	
	@Test(dataProvider = "getData")
	public void dataMatrix(String username, String password, int s1_no, String browser) {
		
	}
	
	@DataProvider
	
	public Object [][] getData() {
		Object [][] data = new Object [3][4];
		
		data [0][0] = "username1";
		data [0][1] = "password1";
		data [0][2] = 12345;
		data [0][3] = "chrome";
		
		data [1][0] = "username2";
		data [1][1] = "password2";
		data [1][2] = 12346;
		data [1][3] = "firefox";
		
		data [2][0] = "username3";
		data [2][1] = "password3";
		data [2][2] = 12347;
		data [2][3] = "edge";
		
		return data;
		
		
		
	}
}
