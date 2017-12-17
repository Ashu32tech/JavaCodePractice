package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;



public class SetTest {

	public static void main(String...args){
	HashSet<String> as=new HashSet<String>();
	LinkedHashSet<String> lhs=new LinkedHashSet<String>();
	TreeSet<String> ts=new TreeSet<String>();
	
	as.add("b");
	as.add("c");
	as.add("a");
	
	
	java.util.Iterator<String> itr=as.iterator();
	
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	

	lhs.add("b");
	lhs.add("c");
	lhs.add("a");
	

	ts.add("b");
	ts.add("c");
	ts.add("a");
	
	System.out.println(as);

	System.out.println(lhs);
	
	System.out.println(ts);
	
	}
	
	
}
