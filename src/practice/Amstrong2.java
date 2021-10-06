package practice;

public class Amstrong2 {
public static void main(String[] args) {
	int a,b,c=0;
	for (int i = 100; i <=500; i++) {
		a=i;
		while (a>0) {
			b=a%10;
			c=c+(b*b*b);
			a=a/10;
		}
			if (c==i) 
			System.out.println(i);	
			i++;		
		}
	}
}

