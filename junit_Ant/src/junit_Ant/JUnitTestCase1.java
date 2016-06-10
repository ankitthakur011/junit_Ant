package junit_Ant;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTestCase1 {

	@BeforeClass  // static
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("Hello.. Im in before class method");
	}

	@Before
	public void setUp() throws Exception {
	
    	System.out.println("Hello.. im in Before test method");
	}

	@Test
	public void testcase1() {
		System.out.println("Hello... Im in First test case");
	}
	
	@Test
	public void testcase2() {
		System.out.println("Hello... Im in Second test case");
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("Hello.. im in After test method");   
	}

	@AfterClass   //static
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Hello.. im in After class method");   
		}

	}


