import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception_7 {
	//MathOperation addition=add(a,b)->a+b;

	public static void main(String args[]){
		FileInputStream  fis=null;
		try{
			fis=new FileInputStream("D:/abc.txt");
		int i=Integer.parseInt(null);
		}catch(FileNotFoundException | NumberFormatException e){
			e.printStackTrace();
		}finally{
			System.out.println(fis);
		}
		
	}
	
	
}
/*interface MathOperation {
    int operation(int a, int b);
 }*/
