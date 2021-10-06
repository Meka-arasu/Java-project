package practice;

public class BeakContinue {
	public static void main(String[] args) {
		System.out.println("BREAK:");

		for (int i = 0; i < 15; i++) {
			System.out.println(i);
			if (i > 12) {
				break;
			}

		}
		System.out.println("CONTINUE:");

		for (int j = 0; j < 15; j++) {
			if (j == 2)
				continue;
			System.out.println(j);
		}

	}
}
