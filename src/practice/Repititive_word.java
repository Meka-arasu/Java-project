package practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;

public class Repititive_word {
public static void main(String[] args) {
	String s="welcome to java course to study java";
	String[] split = s.split(" ");
	Map<String, Integer> map=new LinkedHashMap<String, Integer>();
	for (String x : split) {
		if (map.containsKey(x)) {
			Integer count=map.get(x);
			count++;
			map.put(x,count++);
		
		} else {
           map.put(x, 1);
		}
		System.out.println(map);
		Set<Entry<String,Integer>>entrySet=map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry);
			}
			
		}
		
	}
	
	
}
}
