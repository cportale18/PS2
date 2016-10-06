package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sun.javafx.geom.Crossings.EvenOdd;

public class MyInteger_Test {

	@Test
	public void test() {
		assertTrue(1 == 1);
	}

	public void TestReturnEven() {
		assertEquals(true, 2);
		assertEquals(false, 1);
	}

	public void TestReturnOdd() {
		assertEquals(true, 1);
		assertEquals(false, 2);
		
	//public void TestReturnPrime() {
		//assertEquals(true, 2);
		//assertEquals(false, 4);
		//assertEquals(true, 37);
		//assertEquals(false, 100);
	//}

}
}