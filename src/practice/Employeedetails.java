package practice;

public class Employeedetails {
	static int id = 1111;

	private void namee(String name) {
		System.out.println(name);
		this.empid();
		this.age();
		this.mobno();
	}

	private static void empid() {
		System.out.println(id);
	}

	private void age() {
		int age = 26;
		System.out.println(age);

	}

	private final void mobno() {
		long mn = 9876543210l;
		System.out.println(mn);
	}

	public static void main(String[] args) {
		Employeedetails e = new Employeedetails();
		e.namee("aaaaaaaa");

	}
}
