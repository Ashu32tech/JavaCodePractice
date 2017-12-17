package map;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	Employee(){
		
	}
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}		
	public String toString(){
		 return "Employee{" + "name=" + name + ", id=" + id  + "}";
	}
	

	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return this.name.compareTo(e.name);
	}
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
	

}
