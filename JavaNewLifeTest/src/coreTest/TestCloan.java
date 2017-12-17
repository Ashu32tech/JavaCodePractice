package coreTest;

class Employee implements Cloneable{
	int empId;
	String name;
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	
	void showRecord(){
		System.out.println(empId+" "+name);
	}
	Employee(int empId,String name){
		this.empId=empId;
		this.name=name;
				
	}
} 
public class TestCloan {
		public static void main(String args[]){
			Employee e=new Employee(1,"ashutosh");
			try {
				Employee e1=(Employee)e.clone();
				e1.showRecord();
			} catch (CloneNotSupportedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	
	
}
