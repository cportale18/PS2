package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sun.javafx.geom.Crossings.EvenOdd;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}
	
	public boolean TestReturnEven() {
		assertTrue(EvenOdd.returnNum(2));
		assertFalse(EvenOdd.returnEven(1));
		MyInteger EvenOdd = new MyInteger();
	}
	public boolean TestReturnOdd() {
		assertTrue(EvenOdd.returnOdd(1));
		assertFalse(EvenOdd.returnOdd(2));
		MyInteger OddOdd = new MyInteger();
}

