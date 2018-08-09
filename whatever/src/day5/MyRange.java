package day5;

public class MyRange {
	
	String input;
	int range[] = {0,1,2,3,4,5,6,7,8,9};

	public MyRange(String string) {
		this.input = string;
	}

	public boolean startWithInclude() {
		return this.input.startsWith("[");
	}

	public boolean endWithInclude() {
		return this.input.endsWith("]");
	}

	public boolean startWithExclude() {
		return this.input.startsWith("(");
	}

	public boolean endWithExclude() {
		return this.input.endsWith(")");
	}

	public String startValue() {
		String response = "";
		String newInput = "" + this.input.charAt(1);
		if(startWithInclude()) {
			response = newInput;
		} else if(startWithExclude()) {
			int value = Integer.parseInt(newInput);
			value++;
			response = "" + value;
		}
		return response;
	}

	public String endValue() {
		String response = "";
		String newInput = "" + this.input.charAt(this.input.length() - 2);
		if(endWithInclude()) {
			response = newInput;
		} else if(endWithExclude()) {
			int value = Integer.parseInt(newInput);
			value--;
			response = "" + value;
		}
		return response;
	}

	public String getResult() {
		String result = "";
		int startValue = Integer.parseInt(startValue());
		int endValue = Integer.parseInt(endValue());
		for(int i = startValue; i <= endValue; i++) {
			result = result + range[i] + ",";
		}
		
		return removeLastChar(result);
	}

	private String removeLastChar(String result) {
		int length = result.length();
		if(length != 0) {
			result = result.substring(0, length - 1);
		}
		return result;
	}

}
