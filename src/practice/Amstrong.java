package practice;

public class Amstrong {
	public static void main(String[] args) {
		int a, b, c;
		int i = 100;
		while (i < 500) {
			a = i;
			c=0;
			while (a >0) {
				b = a % 10;
				c = c + (b * b * b);
				a = a / 10;
			}

			if (c == i) 
				System.out.println(i);
				i++;
		}
	}
}