package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapTest {
    public static void main(String[] args) {
    	
    	   Map <String, String> cityMap = new HashMap<String, String>();
           cityMap.put("CY","Cew York City" );
           cityMap.put("AD", "Aew Delhi");
           cityMap.put("BW", "Bewark");
           cityMap.put("DP", "Dewport");
           //TreeMap tm=new TreeMap(cityMap);
           
           //System.out.println(tm);
           
           
          Set<Entry<String,String>> cityMap1=cityMap.entrySet();
          List l1=new ArrayList(cityMap1);
          
         // Employee e1=new Employee(2,"bshu");
          // Employee e2=new Employee(1,"ashu");
          
          List l2=new ArrayList();
          //l2.add(e1);
          //l2.add(e2);
           
          Collections.sort(l1,new Comparator<Map.Entry<String, String>>(){
			@Override
			public int compare(Map.Entry<String, String> o1,Map.Entry<String, String> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}  
          });
           
          
          
          
           System.out.println(l1);
           System.out.println(cityMap.containsKey("NY"));
           System.out.println(cityMap.containsValue("New Delhi"));
    	
    	
    /*	
    	
    	Employee e1=new Employee(1,"a");
    	Employee e2=new Employee(1,"a");
    	System.out.println(e1==e2);
    	System.out.println(e1.equals(e2));
    	
    	Map mp=new HashMap();
    	mp.put(1, "a");
    	mp.put(1, "b");
    	mp.put(1, "c");
    	mp.put(1, "d");
    	
    	System.out.println(mp.get(1));*/
    	
    	
    	
    	
    	//System.out.println(e1.toString());
    	
    	/*
    	Iterator<Entry<String,String>> itr=cityMap.entrySet().iterator();
    	
    	
    	while(itr.hasNext()){
    		//cityMap.put("NM", "NEW MEANING");
    	//	itr.remove();
    		System.out.println(itr.next());
    		//cityMap.remove("NY");
    	}
    	
    	Set<Entry<String,String>> ent=cityMap.entrySet();
    	for(Entry<String,String> e1:ent){
    		System.out.println(e1);	
    	}
    	
    	Set<String> kset =cityMap.keySet();
    	for(String s:kset){
    		System.out.println(s);
    	}
    	
    	Iterator<String> itr11=cityMap.values().iterator();
    	while(itr11.hasNext()){
    	System.out.println(itr11.next());	
    	}*/
    	
    	//Map<String, String> p=Collections.synchronizedMap(cityMap);
    	//Map<String, String> p=Collections.unmodifiableMap(cityMap);
    	//p.put("KLM", "LUCKNOE");
    //	System.out.println(p.size());
    	
    	
    	
    	/*
        Map <Key, String> cityMap = new HashMap<Key, String>();
        cityMap.put(new Key(1, "NY"),"New York City" );
        cityMap.put(new Key(2, "ND"), "New Delhi");
        cityMap.put(new Key(3, "NW"), "Newark");
        cityMap.put(new Key(4, "NP"), "Newport");

        System.out.println("size before iteration " + cityMap.size());
        Iterator <Key> itr = cityMap.keySet().iterator();
        while (itr.hasNext()){
            System.out.println(cityMap.get(itr.next()));     
        }
        System.out.println("size after iteration " + cityMap.size());    
    }
 
}

// This class' object is used as key
// in the HashMap
class Key{
 int index;
 String Name;
 Key(int index, String Name){
  this.index = index;
  this.Name = Name;
 }
 
 @Override
 // A very bad implementation of hashcode
 // done here for illustrative purpose only 
 public int hashCode(){
  return 5;
 }
 
 @Override
 // A very bad implementation of equals
 // done here for illustrative purpose only 
 public boolean equals(Object obj){
  return true;
*/
    	
    }
 
}