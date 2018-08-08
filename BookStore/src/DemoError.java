
public class DemoError {
	public static void main(String[] args) {
		DemoError d = new DemoError();
		d.processProactive(0);
		d.processReactive(0);
	}
	
	double processReactive(int input) {
		try {
			return 10/input;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return -1;
	}

	double processProactive(int input) {
		// Fail fast
		if(input == 0) {
			return -1;
		}
		return 10/input;
	}
}
