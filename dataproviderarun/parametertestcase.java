package dataproviderarun;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametertestcase 

{

	
	@Test
	@Parameters({"adminuserid"})
	void getlogindetails(String uid)
	{
		System.out.println(uid);
	}
	
	
	
}
