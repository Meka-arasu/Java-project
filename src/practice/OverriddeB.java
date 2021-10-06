package practice;

public class OverriddeB extends Overridde {
	public void overr() {
        int a = 1234;
		String s = "pqrs";
		float f = 2167.7f;
		System.out.println(a);
		System.out.println(s);
		System.out.println(f);
	}

	public static void main(String[] args) {
		OverriddeB o = new OverriddeB();
		o.overr();

	}

}
