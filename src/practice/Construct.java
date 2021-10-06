package practice;

public class Construct {
	public Construct() {
		System.out.println("pranav");
	}

	public Construct(String s) {
		System.out.println(s);
	}

	public Construct(long l) {
		System.out.println(l);
	}

	public Construct(float f) {
		System.out.println(f);
	}

	public Construct(char c) {
		System.out.println(c);
	}

	public static void main(String[] args) throws Throwable {
		Construct c = new Construct();
		Construct c1 = new Construct("aabbbaaa");
		Construct c2 = new Construct(34554566756767676l);
		Construct c3 = new Construct('A');
		c.finalize();
		c1.finalize();
		c2.finalize();
		c3.finalize();
	}
}
