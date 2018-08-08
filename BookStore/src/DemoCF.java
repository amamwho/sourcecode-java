import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoCF {
	public static void main(String[] args) {
		// array :: fix length
		int[] numbers = {1,2,3};
		System.out.println(numbers.length);
		for(int i : numbers) {
			System.out.println(i + ", ");
		}
		
		//List :: dynamic array
		System.out.println();
		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		System.out.println("Size: " + numberList.size());
		// For each
		for(Integer integer : numberList) {
			System.out.println(integer + ", ");
		}
		System.out.println();
		int size = numberList.size();
		// For by index
		for(int i = 0; i < size; i++) {
			System.out.println(numberList.get(i) + ", ");
		}
		
		// Map
		System.out.println();
		Map<String, Integer> employees = new HashMap<>();
		employees.put("peng", 29);
		employees.put("jek", 24);
		System.out.println(employees.get("peng"));
		System.out.println(employees.get("jek"));
		if(!employees.containsKey("xxx")) {
			System.out.println("Key not found");
		}
		
		Set<String> keys = employees.keySet();
		for(String key : keys) {
			System.out.printf("%s -> %d\n", key, employees.get(key));
		}
	}
}
