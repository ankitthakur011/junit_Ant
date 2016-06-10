package junit_Ant;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
{JUnitTestCase1.class,JUnitTestCase2.class})

public class MyTestSuiteRunner {

}
