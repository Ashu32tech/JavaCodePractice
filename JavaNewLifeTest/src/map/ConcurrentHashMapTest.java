package map;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
	
	public static void main(String args[]){
		ConcurrentHashMap<Integer,String> concurrentHashMap=new ConcurrentHashMap<Integer,String>();
		concurrentHashMap.put(1, "ABCD");
		concurrentHashMap.put(2, "PQR");		
		System.out.println(concurrentHashMap.entrySet());
		System.out.println(concurrentHashMap.putIfAbsent(1, "XYZ"));
		System.out.println(concurrentHashMap.putIfAbsent(3, "XYZ"));
		System.out.println(concurrentHashMap.entrySet());
		Iterator itr=concurrentHashMap.entrySet().iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			concurrentHashMap.put(4, "xyz");
		}
		System.out.println(concurrentHashMap.entrySet());
	}
}
