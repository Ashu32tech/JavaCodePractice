package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String args[]){
		Map<String,String> linkedHashMap=new LinkedHashMap<String,String>();
		
		linkedHashMap.put("v", "a");
		linkedHashMap.put("d", "a");
		linkedHashMap.put("g", "a");
		linkedHashMap.put("r", "a");
		linkedHashMap.put("v", "t");
		
		System.out.println(linkedHashMap);
		
		
		
		Map<String,String> hashMap=new HashMap<String,String>();
		
		hashMap.put("v", "a");
		hashMap.put("d", "a");
		hashMap.put("g", "a");
		hashMap.put("r", "a");
		hashMap.put("v", "t");
		
		System.out.println(hashMap);
		
		
		
		
	}
}
