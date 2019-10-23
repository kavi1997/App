package sample.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.webappp.Controller;

public class PowerTest1 {

	@Test
	public void test() {
		Controller test=new Controller();
		int output =test.power(4,0);
		assertEquals(1,output);
	}


}
