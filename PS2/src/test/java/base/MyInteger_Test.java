package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	MyInteger my_even = new MyInteger(4);
	MyInteger my_odd = new MyInteger(3);
	MyInteger my_prime = new MyInteger(13);
	int even = 4;
	int odd = 3;
	int prime = 13;

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
	public void testIsEven() {
		assertEquals("testIsEven() failed", true, my_even.isEven());
		assertEquals("testIsEven() failed", false, my_odd.isEven());
		assertEquals("testIsEven() failed", true, MyInteger.isEven(even));
		assertEquals("testIsEven() failed", false, MyInteger.isEven(odd));
		assertEquals("testIsEven() failed", true, MyInteger.isEven(my_even));
		assertEquals("testIsEven() failed", false, MyInteger.isEven(my_odd));
	}

	@Test
	public void testIsOdd() {
		assertEquals("testIsOdd() failed", true, my_odd.isOdd());
		assertEquals("TestIsOdd() failed", false, my_even.isOdd());
		assertEquals("testIsOdd() failed", true, MyInteger.isOdd(odd));
		assertEquals("testIsOdd() failed", false, MyInteger.isOdd(even));
		assertEquals("testIsOdd() failed", true, MyInteger.isOdd(my_odd));
		assertEquals("testIsOdd() failed", false, MyInteger.isOdd(my_even));
	}

	@Test
	public void testIsPrime() {
		assertEquals("testIsPrime() failed", true, my_prime.isPrime());
		assertEquals("TestIsPrime() failed", false, my_even.isPrime());
		assertEquals("testIsPrime() failed", true, MyInteger.isPrime(prime));
		assertEquals("testIsPrime() failed", false, MyInteger.isPrime(even));
		assertEquals("testIsPrime() failed", true, MyInteger.isPrime(my_prime));
		assertEquals("testIsPrime() failed", false, MyInteger.isPrime(my_even));
	}

	@Test
	public void testEquals() {
		MyInteger equals_test = new MyInteger(13);
		assertTrue("testEquals() failed", equals_test.equals(13));
		assertFalse("testEquals() failed", equals_test.equals(10));
		assertTrue("testEquals() failed", equals_test.equals(my_prime));
		assertFalse("testEquals() failed", equals_test.equals(my_even));
	}

	@Test
	public void testGetInteger() {
		MyInteger equals_test = new MyInteger(13);
		assertEquals("testGetInteger() failed", 13, equals_test.getInteger());
	}
}
