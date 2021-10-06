package practice;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int a, b, c = 0;
		System.out.println("enter the  number to check palindrome");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		int i=a;
		while (a > 0) {
			b = a % 10;
			c = (c * 10) + b;
			a = a / 10;

		}
		System.out.println(c);
		if (c == i) {
			System.out.println("The no is palindrome");

		} else
			System.out.println("the no is not palindrome");

	}
}
