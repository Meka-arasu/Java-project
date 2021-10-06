package practice;

public class Interfacee1 implements Interfacee  {
@Override
public void details(String s) {
	System.out.println(s);
	
}
public void mobileno() {
	long m=9876543210l;
	System.out.println(m);
}
@Override
	public void adress() {
   String a="bmbnbmn  hjhbhj bjhb232";
		System.out.println(a);
	}
public static void main(String[] args) {
	Interfacee1 i=new Interfacee1();
	i.details("aaaaaaa");
	i.mobileno();
	i.adress();
}
}
