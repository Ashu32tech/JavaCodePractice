package list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*-------------------------imp start-----------------*/
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Deque;
/*-------------------------imp end-----------------*/



/**
 * Copyright (c), AnkitMittal JavaMadeSoEasy.com
 */
public class ArrayListTest {
    	public static void main(String args[]) {
 
        // creates array with initial capacity of 10.        
    	List<String> arrayList = new ArrayList<String>();
        arrayList.add("ankit");
        arrayList.add("javaMadeSoEasy");
        arrayList.add(null);
        arrayList.add(null);
        
        Set<String> setList = new HashSet<String>();
        setList.add("hhhh");
        
        System.out.println("-------use iterator-------"+arrayList);
        
        // fail-fast
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
               //arrayList.add("newEle"); // unComment to avoid ConcurrentModificationException
        	
               System.out.println(iterator.next());
               //iterator.remove(); //remove always should after next otherwise illlegalException will come.
        }
        
        System.out.println("-------use listIterator-------");
        // fail-fast
        ListIterator<String> listIterator = arrayList.listIterator();
        listIterator.next();
        listIterator.previous();
        while (listIterator.hasNext()) {
             //  arrayList.add("newEle"); // unComment to avoid ConcurrentModificationException
               System.out.println(listIterator.next());
        }
 
        System.out.println("-------use Enumeration-------");
        // fail-fast
        Enumeration<String> listEnum = Collections.enumeration(arrayList);
        while (listEnum.hasMoreElements()) {
               //arrayList.add("newEle"); // unComment to avoid ConcurrentModificationException
               System.out.println(listEnum.nextElement());
        }
 
        System.out.println("-------use enhanced for loop-------");
           //enhanced for loop is fail-fast
        for (String string : arrayList) {
               //arrayList.add("newEle"); // unComment to avoid ConcurrentModificationException
               System.out.println(string);
        }
        
        
        
        // creates array with initial capacity of 10.
        List<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("ankit");
        arrayList1.add("javaMadeSoEasy");

        // getting synchronized ArrayList
        List<String> synchronizedList = Collections.synchronizedList(arrayList1);
         
        
        //Iterator on synchronizedList won't be synchronized, so will have to
        //synchronize list using synchronization block during iteration
          System.out.println("------- iterating on synchronized list -------");
          synchronized(synchronizedList){
          Iterator<String> iterator1 = synchronizedList.iterator();
          while (iterator1.hasNext()) {
               System.out.println(iterator1.next());
         	}              
          }
          
          arrayList.add("ashutosh");
        
          System.out.println(arrayList);
          List<String> unModifiableList=Collections.unmodifiableList(arrayList);
          //unModifiableList.add("ashutosh"); 
                        /*Removing the duplicate elements*/          
          ArrayList<String> arrList1=new<String> ArrayList();
          arrList1.add("Ashutosh");
          arrList1.add("Ashutosh");
          arrList1.add("Rahul");
          arrList1.add("Rahul");
          arrList1.add("Amit");
          arrList1.add("Ravi");
          System.out.println(arrList1);
          Set uniqArrList=new HashSet(arrList1);
          System.out.println(uniqArrList);
          arrList1.clear();
          System.out.println(arrList1);
          arrList1.addAll(uniqArrList);
          System.out.println(arrList1); 
          Collections.sort(arrList1);
          System.out.println(arrList1); 
          
    	}
}