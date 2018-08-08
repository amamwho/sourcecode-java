import java.util.ArrayList;
import java.util.List;

public class DemoLd {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		numbers.stream().map(i -> i*2).forEach(System.out::println);
		System.out.println();
		numbers.stream().filter(i -> i*2 > 3).forEach(System.out::println);
		System.out.println();
		numbers.forEach(System.out::println);
	}

}
