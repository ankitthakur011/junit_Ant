package junit_Ant;


import java.util.Arrays;

public class ParameterTest {

	public static void main(String[] args) {
		
		Object [][] data = new Object[1][2];
		
		// User1 data
		data [0][0] = "User1";
		data [0][1] = "password";
		data [0][2] = 123456;
		
		// User2 data
		data [1][0] = "User2";
		data [1][1] = "password2";
		data [1][2] = 789456;
		
		Arrays.asList(data);

	}

}
