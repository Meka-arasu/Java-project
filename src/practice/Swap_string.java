package practice;

public class Swap_string {
public static void main(String[] args) {
	String a="always";
	String b="welcome";
	a=a+b;
	b=a.substring(0,a.length()-b.length());
	a=a.substring(b.length());
			System.out.println(a +" "+b);
}
}
