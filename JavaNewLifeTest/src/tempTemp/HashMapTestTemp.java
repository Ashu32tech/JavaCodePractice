package tempTemp;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTestTemp {
	
		public static void main(String args[]){
		Map<String ,String> mapTestTemp=new HashMap<String,String>();
		mapTestTemp.put("NY", "New York");
		mapTestTemp.put("ND", "New Delhi");
		mapTestTemp.put("WAS", "Wasington");
		mapTestTemp.put("BOM", "Bombay");
		Set<Entry<String,String>> s1=mapTestTemp.entrySet();
		for(Entry<String ,String> e:s1){
			System.out.println(e.getValue());
			System.out.println(e.getKey());
		}
		
		Iterator itr=s1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		Collections.synchronizedMap(mapTestTemp);
		
		
		}
}
