package dataproviderarun;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderforarun 

{

	@Test(dataProvider="getdata")
public void login(String uname,String password)
{
	System.out.println(uname);
	System.out.println(password);
}
	@DataProvider
	public Object getdata()
	
	
	{
	
		Object [][] obj= new Object[1][2];
		obj[0][0]="asha";
		obj[0][1]="pwd";
		return obj;
		
	}
	
}
	
	
	

