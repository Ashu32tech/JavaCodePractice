package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class SortedByValueAccending implements Comparator<Map.Entry<Integer,Integer>>{

	@Override
	public int compare(Map.Entry<Integer, Integer> e1,Map.Entry<Integer, Integer> e2) {
System.out.println("i am in");
		return (e1.getValue()).compareTo(e2.getValue());
	}
	
	
}




public class SortMapByValueAscendingExample {

	public static void main(String args[]){
		
		Map<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
		
		hashMap.put(3, 4);
		hashMap.put(1, 1);
		hashMap.put(4, 3);
		hashMap.put(2, 6);
		hashMap.put(5, 5);
		
		Set<Entry<Integer,Integer>> s1=new HashSet<Entry<Integer,Integer>>(hashMap.entrySet());
		List<Entry<Integer,Integer>> l1=new ArrayList<Entry<Integer,Integer>>(s1);
		
		Collections.sort(l1,new SortedByValueAccending());
		
		System.out.print("\nAfter sorting by value(ascending): ");
		hashMap.clear();
        for(Map.Entry<Integer, Integer> entry:l1)
         System.out.print(entry.getKey()+"="+entry.getValue()+"  ");
       
		
		
		
		
	}
	
	
	
	
}
