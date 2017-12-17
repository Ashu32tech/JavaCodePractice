package serilizationCloan;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestImp {
	public static void main(String args[]) {
		
		try {	
		FileInputStream fout=new FileInputStream("ser.txt");
		ObjectInputStream objOut=new ObjectInputStream(fout);
		Employee emp;
		while((emp=(Employee)objOut.readObject())!=null){
			System.out.println(emp);
		}		
			System.out.println("serilazied");
		}  catch (EOFException e) {
            System.out.println("File ended");
     }  catch (FileNotFoundException e) {
            e.printStackTrace();
     } catch (IOException e) {
            e.printStackTrace();
     } catch (ClassNotFoundException e) {
            e.printStackTrace();
     }

	}
	
}
