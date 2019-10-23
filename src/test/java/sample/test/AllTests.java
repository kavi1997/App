package sample.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PowerTest.class, PowerTest1.class, PowerTest2.class })
public class AllTests {

}
