package practice;

public class Variable {
	static int a = 234;
	static float b = 23.45f;

	private void jvaa() {
		String s = "abcdef";
		System.out.println(s);
	}

	private static void src() {
		System.out.println(a);
	}

	private static void mmm() {
		System.out.println(b);

	}

	public static void main(String[] args) {
		Variable v = new Variable();
		v.jvaa();
		src();
		mmm();
	}
}
