package dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviders {
	@DataProvider(name="InvalidUserCredentials")
	public Object[][] userCredentialsData()         //return type is Object[][]
	{
		Object[][] data=new Object[3][2];           //Object[][] is the datatype of the array
		data[0][0]="anikhaw1234@gmail.com";
		data[0][1]="anik123asd";
		
		data[1][0]="anikha123@gmail.com";
		data[1][1]="123asw";
		
		data[2][0]="anikhaw1234@gmail.com";
		data[2][1]="anik123asd12";
		
		return data;
	}

}
