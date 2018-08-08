import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsogramTest {

	@Test
	void test1() {
		Isogram isogram = new Isogram();
		assertEquals(true, isogram.check("abc"));
	}
	
	@Test
	void test2() {
		Isogram isogram = new Isogram();
		assertEquals(true, isogram.check("abc-feg-hij"));
	}
	
	@Test
	void test3() {
		Isogram isogram = new Isogram();
		assertEquals(true, isogram.check("abc feg hij"));
	}
	
	@Test
	void test4() {
		Isogram isogram = new Isogram();
		assertEquals(false, isogram.check("abc feg hij a"));
	}
	
	@Test
	void test5() {
		Isogram isogram = new Isogram();
		assertEquals(false, isogram.check("abc aeg hij"));
	}

}
