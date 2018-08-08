import java.util.HashMap;
import java.util.Map;

public class Isogram {

	public Boolean check(String string) {
		string = string.toLowerCase().replaceAll(" ", "").replaceAll("-", "");
		
		Map<String, Integer> check = new HashMap<>();
		int size = string.length();
		for(int i = 0; i < size; i++) {
			String singleChar = "" + string.charAt(i);
			if(check.containsKey(singleChar)) {
				return false;
			} else {
				check.put(singleChar.toLowerCase(), i);
			}
		}
		return true;
	}

}
