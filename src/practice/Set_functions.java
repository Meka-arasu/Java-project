package practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_functions {
	public static void main(String[] args) {
		Set<String> name = new LinkedHashSet<String>();
		name.add("aaaa");
		name.add("bbbb");
		name.add("cccc");
		name.add("dddd");
		name.add("eeee");
		System.out.println("name set:" + name);
		int size = name.size();
		System.out.println("Size:" + size);
		boolean contains = name.contains("aaaa");
		System.out.println("set contains aaaa:" + contains);
		name.clear();
		System.out.println("name set:" + name);
		name.add("aaaa");
		name.add("bbbb");
		name.add("cccc");
		name.add("dddd");
		System.out.println("name set:" + name);
		Set<String> name1 = new LinkedHashSet<String>();
		name1.add("gggg");
		name1.add("aaaa");
		name1.add("jjjj");
		System.out.println("name set2:" + name1);
        name.addAll(name1);
		System.out.println("name set:" + name);
		name.retainAll(name1);
		System.out.println("name set:" + name);
		name.removeAll(name1);
		System.out.println("name set:" + name);
		boolean empty = name.isEmpty();
		System.out.println("set is empty or not :"+empty);
		boolean equals = name.equals(name1);
		System.out.println("sets are equal or not :"+equals);
		



	}

}
