package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestStu implements Comparable<TestStu>{
	public static void main(String args[]){
		List<TestStu> list1=new ArrayList<TestStu>(); 
		
		TestStu t1=new TestStu();
		TestStu t2=new TestStu();
		TestStu t3=new TestStu();
		
		t1.setId(3);
		t1.setName("ashu");
		
		t2.setId(1);
		t2.setName("bublu");
		
		t3.setId(6);
		t3.setName("depti");
		
		list1.add(t1);
		list1.add(t2);
		list1.add(t3);
		
	
		Collections.sort(list1/*,new Comparator<TestStu>(){

			@Override
			public int compare(TestStu o1, TestStu o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
			
		}*/
		);
		
		System.out.println(list1);	
	}
	
		@Override
	public String toString() {
		return "TestStu [id=" + id + ", name=" + name + "]";
	}

		private int id;
		private String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

		@Override
		public int compareTo(TestStu o) {
			// TODO Auto-generated method stub
			return this.name.compareTo(o.name);
		} 
}
