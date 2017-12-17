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
import java.util.TreeMap;

class SortedByKeyAccending implements Comparator<Map.Entry<Integer,Integer>>{

	@Override
	public int compare(Map.Entry<Integer, Integer> entry_1,Map.Entry<Integer, Integer> entry_2) {
		// TODO Auto-generated method stub
		return entry_1.getKey().compareTo(entry_2.getKey());
	}

}


public class SortMapByKeyAscendingExample {
	
			public static void main(String args[]){
				Map<Employee,Integer> hashMap=new TreeMap<Employee,Integer>();
				/*hashMap.put(3, 1);
				hashMap.put(1, 2);
				hashMap.put(4, 3);
				hashMap.put(2, 4);
				hashMap.put(5, 5);
				hashMap.put(null, 6);*/
				
				hashMap.put(new Employee(1,"b"), 1);
				hashMap.put(new Employee(2,"c"), 2);
				hashMap.put(new Employee(3,"a"), 3);
				hashMap.put(new Employee(4,"g"), 4);
				hashMap.put(new Employee(5,"d"), 5);
				hashMap.put(new Employee(6,"f"), 6);
				
				//Collections.sort(list);
				
			/*	Map<Integer,Integer> treeMap=new TreeMap<Integer,Integer>();
				treeMap.putAll(hashMap);*/
				
				
				/*treeMap.put(3, 1);
				treeMap.put(1, 2);
				treeMap.put(4, 3);
				treeMap.put(2, 4);
				treeMap.put(5, 5);
				
				System.out.println(treeMap.entrySet());
				*/
				
				/*Set<Entry<Integer,Integer>> st1=new HashSet<Entry<Integer,Integer>>(hashMap.entrySet());
				List<Entry<Integer,Integer>> lst1=new ArrayList<Entry<Integer,Integer>>(st1);
				
				Collections.sort(lst1,new SortedByKeyAccending());
				*/
				System.out.println(hashMap.entrySet());
				
			}

}
