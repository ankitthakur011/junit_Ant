package junit_Ant;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//Step 1
@RunWith(Parameterized.class)

public class ParameterizedTestCase {
//Step 2
	public String Username;
	public String Password;
	public int Pin;
//Step 3
	public ParameterizedTestCase (String username, String password, int pin)
	{
		this.Username=username;
		this.Password=password;
		this.Pin= pin;
	}
//Step 4
	@Parameters
	public  static Collection<Object[]> GetData()
	{
		Object [][] data = new Object[2][3];
		
		// User1 data
		data [0][0] = "User1";
		data [0][1] = "password";
		data [0][2] = 123456;
		
		// User2 data
		data [1][0] = "User2";
		data [1][1] = "password2";
		data [1][2] = 789456;
		
		return Arrays.asList(data);
		
	}
	
	@Test
	public void testRegister()
	{
		System.out.println("Output:"+ "----" +Username +"----"+ Password +"----"+ Pin);
	}
	
}


