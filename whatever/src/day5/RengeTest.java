package day5;

import static org.junit.Assert.*;

import org.junit.Test;

public class RengeTest {

	@Test
	public void startWithInclude() {
		MyRange range = new MyRange("[1,5]");
		assertTrue(range.startWithInclude());
	}
	
	@Test
	public void endWithInclude() {
		MyRange range = new MyRange("[1,5]");
		assertTrue(range.endWithInclude());
	}
	
	@Test
	public void startWithExclude() {
		MyRange range = new MyRange("(1,5)");
		assertTrue(range.startWithExclude());
	}
	
	@Test
	public void endWithExclude() {
		MyRange range = new MyRange("(1,5)");
		assertTrue(range.endWithExclude());
	}
	
	@Test
	public void startValue1() {
		MyRange range = new MyRange("[1,5]");
		assertEquals("1", range.startValue());
	}
	
	@Test
	public void startValue2() {
		MyRange range = new MyRange("(1,5]");
		assertEquals("2", range.startValue());
	}
	
	@Test
	public void endValue1() {
		MyRange range = new MyRange("[1,5]");
		assertEquals("5", range.endValue());
	}
	
	@Test
	public void endValue2() {
		MyRange range = new MyRange("[1,5)");
		assertEquals("4", range.endValue());
	}

	@Test
	public void result1() {
		MyRange range = new MyRange("[1,5]");
		assertEquals("1,2,3,4,5", range.getResult());
	}
	
	@Test
	public void result2() {
		MyRange range = new MyRange("(1,5)");
		assertEquals("2,3,4", range.getResult());
	}
	
	@Test
	public void result3() {
		MyRange range = new MyRange("(1,5]");
		assertEquals("2,3,4,5", range.getResult());
	}
	
	@Test
	public void result4() {
		MyRange range = new MyRange("[1,5)");
		assertEquals("1,2,3,4", range.getResult());
	}
	
	@Test
	public void result5() {
		MyRange range = new MyRange("[0,0]");
		assertEquals("0", range.getResult());
	}
}
