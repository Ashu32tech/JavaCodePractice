package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpTest {
	public static void main(String args[]){
		ArrayList<Employee> arryList=new ArrayList<Employee>();
	Employee emp1=new Employee("chandu",2);
	Employee emp2=new Employee("ravi",1);
	Employee emp3=new Employee("ashu",3);
	arryList.add(emp1);
	arryList.add(emp2);
	arryList.add(emp3);
	System.out.println(arryList);
	Collections.sort(arryList,new CompairEmpId());
	System.out.println(arryList);
	Collections.sort(arryList,new CompairEmpName());
	System.out.println(arryList);
	}
}
