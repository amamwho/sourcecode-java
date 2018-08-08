import static org.junit.Assert.*;

import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

import org.junit.Test;

public class RandomNumberTest {

	@Test
	public void test() {
		RandomNumber randomNumber = new RandomNumber();
		Random random = new Random() { // Anonymous Class
			@Override
			public int nextInt(int bound) {
				return 5;
			}
		};
		random = new Random5();
		assertEquals(5, randomNumber.generate(random));
	}

}

// Override By Method
class Random5 extends Random {

	@Override
	public int nextInt(int bound) {
		Queue<String> q;
		List<String> l;
		Set<String> s;
		return 5;
	}
	
}
