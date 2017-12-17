package testException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class MyException extends RuntimeException{
	MyException(String s){
	super(s);
}
}

public class TestException {
	public static void main(String args[]) throws FileNotFoundException{
		try{
		TestException t=new TestException();
		t.fileTest();
		/*}catch(IOException e){
		
		}catch(NullPointerException e){
			e.printStackTrace();*/
		}catch(Throwable t){
			t.printStackTrace();
			throw new MyException("test");
		}
			
	}
	public void fileTest() throws FileNotFoundException{
		File f=new File("abcd");
		FileInputStream fin=new FileInputStream(f);
	}
	
}
