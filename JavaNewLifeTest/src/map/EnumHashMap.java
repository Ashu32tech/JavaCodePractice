package map;

import java.util.EnumMap;

enum Weekdays{SUNDAY,MONDAY;
	Weekdays(){
		System.out.println("Test");
	}
}

public class EnumHashMap {
		public static void main(String args[]){
				EnumMap<Weekdays,String> enumHashMap=new EnumMap<Weekdays,String>(Weekdays.class); 		
				enumHashMap.put(Weekdays.MONDAY,"hi monday");
				enumHashMap.put(Weekdays.SUNDAY, "hi sunday");
				System.out.println(enumHashMap.entrySet());		
		}	
}
