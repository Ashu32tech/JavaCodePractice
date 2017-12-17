import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapSortTest {
				public static void main(String args[]){
						
						Map<String,Integer> map=new HashMap<>();
						map.put("Orange",3);
						map.put("Red",1);
						map.put("Green",5);
						
						Set<Entry<String,Integer>> set=map.entrySet();
						List<Entry<String,Integer>> list=new ArrayList<Entry<String,Integer>>(set);
						Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){

							@Override
							public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
								// TODO Auto-generated method stub
								return (o1.getValue()- o2.getValue() );
							}
							
						});
					System.out.println(list);
				}
}
