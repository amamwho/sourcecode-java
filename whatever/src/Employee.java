
class Employee2 {
	int id;
	private char name;

	public Employee2() {
	}

	public Employee2(int id) {
		this.id = id;
	}

	public char getName() {
		return name;
	}

	public void setName(char name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}

public class Employee {
	public static void main(String[] args) {
		Employee2 e1 = new Employee2();
		e1.id = 1;
		e1.setName('A');
		
		Employee2 e2 = new Employee2();
		e2.id = 2;
		e2.setName('B');
		
		System.out.println(e1.id);
		System.out.println(e1.getName());
	}
}
