package list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayArrayListExample {
    
    public static void main(String[] args) { 
 
        // ArrayList Example   
  
        ArrayList<String> arrlistobj = new ArrayList<String>();
        arrlistobj.add("Alive is awesome");
        arrlistobj.add("Love yourself");
        arrlistobj.add(1,"this true love");
        
        Iterator it = arrlistobj.iterator();
        System.out.print("ArrayList object output :");  
        while(it.hasNext())         
          System.out.print(it.next() + " ");
      
        // Array Example
 
        String[] arrayobj = new String[5];
        
        arrayobj[0]= "Love yourself";  
        arrayobj[1]= "Alive is awesome";
        arrayobj[2]= "Be in Present"; 
        System.out.print("Array object output :");
        
        for(int i=0; i < arrayobj.length ;i++)
        System.out.print(arrayobj[i] + " ");  
        
        String a[] = new String[]{"abc","klm","xyz","pqr"};
        
        List list1 = Arrays.asList(a); //unmodifiable ArrayList
        
        System.out.println("The list is:" + list1);
 
 }
}