package serilizationCloan;

import java.io.Externalizable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Externalizable {

//Serializable{

	Long serialVersionUID=1l;
	public int id;
	public String name;
	 public Employee(){} 
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString(){
		return "Employee[ "+"id "+id +"name "+name+"]";
	}
	
	@Override
	public void writeExternal(ObjectOutput outObj) throws IOException{
		outObj.writeInt(id);
		outObj.writeObject(name);
		
	}
	
	@Override
	public void readExternal(ObjectInput inObj) throws IOException, ClassNotFoundException{
		this.id=inObj.readInt();
		this.name=(String)inObj.readObject();
	}
	
	
	
}
public class TestExp{
	public static void main(String args[]) {
		Employee e1=new Employee(1,"ramesh");
		Employee e2=new Employee(2,"umesh");
		try {	
		FileOutputStream fout=new FileOutputStream("ser.txt");
	
			ObjectOutputStream objOut=new ObjectOutputStream(fout);
			
			objOut.writeObject(e1);
			objOut.writeObject(e2);
			
			System.out.println("serilazied");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}