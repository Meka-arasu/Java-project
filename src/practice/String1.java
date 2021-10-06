package practice;

public class String1 {
	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("hello");
		StringBuffer s1 = new StringBuffer("hello");
		
		System.out.println("memory for duplicate value of Stringbuffer");
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		String s2 = "welcome";
		String s3 = "welcome";
		System.out.println("memory for duplicte value of string");
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println("append");
		 s=s.append(s2);
		 System.out.println(System.identityHashCode(s));
		 System.out.println("concordination");
		 s2=s2+s3;
		 System.out.println(System.identityHashCode(s2));
		
	}
}
