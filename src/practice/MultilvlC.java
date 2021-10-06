package practice;

public class MultilvlC extends MultilvlB {
	public void empdetails() {
	System.out.println("employee details:");
	}
	public static void main(String[] args) {
		MultilvlC c=new MultilvlC();
		c.empdetails();
		c.namee();
		c.age();
		c.empid();
		
	}
}
