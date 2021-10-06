package practice;

public class Conditionn {
	public static void main(String[] args) {
		int marks = 76;
		if (marks >= 80) {
			System.out.println("First class");

		} else if (marks >= 60 && marks < 80) {
			System.out.println("Second class");

		} else if (marks >= 40 && marks < 60) {
			System.out.println("Third class");
			
		} else {
			System.out.println("Fail");
		}
	}
}
