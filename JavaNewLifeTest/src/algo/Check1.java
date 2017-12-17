package algo;

import java.util.HashSet;

class DulicateElements extends RuntimeException{
	DulicateElements(String s){
		super(s);
	}
}

public class Check1 {

	public static void printDuplicate(char[] a)throws DulicateElements{
		
		HashSet b=new HashSet();
		for(char i:a){
			if(!b.add(i)){
				throw new DulicateElements("duplicate elemet");
			}else{
				b.add(i);
			}			
		}
	}
	
	public static void main(String args[]){
		
		char c[]="ashutosh".toCharArray();
		printDuplicate(c);
		
	}
}
