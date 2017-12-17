package cloneTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CloneTest {
	public static void main(String args[]) throws CloneNotSupportedException, ClassNotFoundException, IOException{
		/*Address addr=new Address(1,"New ashok nagar");
		Employee emp=new Employee(1,"Ashutosh",addr);
		Employee emp1=(Employee) emp.clone();
		System.out.println(emp1);
		emp.getAddress().setAddressLine("Delhi");
		System.out.println(emp1);
		System.out.println(emp);
		System.out.println(emp1.getAddress());
		System.out.println(emp.getAddress());*/
		char xyz=Character.toUpperCase('a');
		System.out.println(xyz);
	    
		
		
		
		
		
	}

}

class Employee implements Cloneable,Serializable{
	int id;
	String name;
	Address address;
	Employee(int id,String name,Address address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	Employee(int id,String name,int id_a,String name_a){
		this.id=id;
		this.name=name;
		address=new Address(id_a,name_a);
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	/*public Employee clone() throws CloneNotSupportedException{
		return (Employee)super.clone();
		
	}*/
	
	public Employee clone() throws CloneNotSupportedException{
		
		Employee e=new Employee(id,name,address.getId(),address.getAddressLine());
		return e;
		//return (Employee)super.clone();
		
	}
	
	
	/*public Employee deepclone() throws IOException, ClassNotFoundException{
		
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(baos);
		oos.writeObject(this);
		
		ByteArrayInputStream byis=new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(byis);
		return (Employee)ois.readObject();
	}*/
	
	public String toString(){
		return this.id+this.name+this.address.id+this.address.addressLine;
	}
	
}
class Address implements Serializable{
	int id;
	String addressLine;
	Address(int id,String addressLine){
		this.id=id;
		this.addressLine=addressLine;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	
}