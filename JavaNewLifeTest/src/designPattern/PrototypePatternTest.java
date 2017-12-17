package designPattern;

import java.util.ArrayList;
import java.util.List;

public class PrototypePatternTest {
	public static void main(String args[]){
		Employee e1=new Employee();
		e1.loadData();
		try {
			Employee e2=(Employee) e1.clone();
			Employee e3=(Employee) e1.clone();
			
			System.out.println(e2.getEmpList());
			System.out.println(e3.getEmpList());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	
	
}
class Employee implements Cloneable{
	
	List<String> empList;
	Employee(){
		this.empList=new ArrayList<String>();
	}
	
	Employee(List<String> empList ){
		this.empList=empList;
	}
	
	void loadData(){
		empList.add("a");
		empList.add("b");
		empList.add("c");
		empList.add("d");
		empList.add("e");
	}
	
	List<String> getEmpList(){
		return empList;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		List temp=new ArrayList<String>();
		for(String s:this.getEmpList()){
			temp.add(s);
		}
		return new Employee(temp);
	}
} 