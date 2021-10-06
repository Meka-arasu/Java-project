package practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Vector_list {
public static void main(String[] args) {
	List<Integer> li=new Vector<Integer>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(11);
	System.out.println("list:"+li);
	List<Integer> li1=new LinkedList<Integer>();
	li1.addAll(li);
	System.out.println("List 2:"+li1);
	Set<Integer> s1=new TreeSet<Integer>();
	s1.add(11);
	s1.add(23);
	s1.add(34);
	System.out.println("set :"+s1);
	
	

}
}
