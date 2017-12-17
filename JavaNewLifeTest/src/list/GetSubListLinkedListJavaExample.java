package list;
/*
  Get SubList from LinkedList Java example
  This java example shows how to get a sublist from Java LinkedList using
  subList method.
*/
 
import java.util.LinkedList;
import java.util.List;
 
public class GetSubListLinkedListJavaExample {
 
  public static void main(String[] args) {
   
    //create LinkedList object
    LinkedList<String> lList = new LinkedList<String>();
   
    //add elements to LinkedList
    lList.add("1");
    lList.add("2");
    lList.add("3");
    lList.add("4");
    lList.add("5");
   
    System.out.println("LinkedList contains : " + lList);
   
    /*
     * To get a sublist from Java LinkedList, use
     * List subList(int start, int end) method.
     *
     * This method returns portion of list containing element from start index
     * inclusive to end index exclusive.
     */
   
    List<String> lst = lList.subList(1,4);
    System.out.println("Sublist contains : " + lst);
 
    /*
     * Please note that sublist is backed by the original list, so any changes
     * made to sublist will also be reflected back to original LinkedList
     */
   
     //remove element from sublist
     lst.remove(2);
     System.out.println("Sublist now contains : " + lst);
     System.out.println("Original LinkedList now contains : " + lList);
     lList.peek();
     lList.poll();
     System.out.println("Original LinkedList now contains 1: " + lList);
     lList.offer("1");
     System.out.println("Original LinkedList now contains 2: " + lList);
     
  }
}