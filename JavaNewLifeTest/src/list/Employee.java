package list;

import java.util.Comparator;

public class Employee{
	String name;
	int id;
	Employee(){}
	Employee(String name,int id){
		this.name=name;
		this.id=id;
	}
	
	/*@Override
	public int compareTo(Employee emp){
		return this.name.compareTo(emp.name);
	}*/
	
	/*@Override
	public int compare(Employee emp1,Employee emp2){
		return emp1.name.compareTo(emp2.name);
	}*/
	

	@Override
	public String toString(){
	    return "name="+name+" "+"id="+id;
	}
}
class CompairEmpName implements Comparator<Employee>{
				
	@Override
				public int compare(Employee o1, Employee o2) {
					// TODO Auto-generated method stub
					return o1.name.compareTo(o2.name);
				}
				
}
class CompairEmpId implements Comparator<Employee>{
	  @Override
	public int compare(Employee o1, Employee o2) {
		  return o1.id-o2.id;
		  
	}
} 
