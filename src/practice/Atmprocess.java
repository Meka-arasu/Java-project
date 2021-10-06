package practice;

import java.util.Scanner;

public class Atmprocess {
	private void carddetails() {
		System.out.println("Insert your card");
		System.out.println("enter pin");
		Scanner pin = new Scanner(System.in);
		int nextInt = pin.nextInt();
		System.out.println("enter transaction");
		Scanner trans = new Scanner(System.in);
		String next = trans.next();
		System.out.println("enter the amount");
		Scanner amt = new Scanner(System.in);
		int nextInt1 = amt.nextInt();
	}

	public static void main(String[] args) {
		Atmprocess a = new Atmprocess();
		a.carddetails();
		System.out.println("do u want to continue");
		Scanner end = new Scanner(System.in);
		String next1 = end.next();
	}
}
