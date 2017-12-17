package coreTest;

class CustomExption extends Exception{
	CustomExption(String s){
		super(s);
	} 
}

public class CustomCheck {
	
	public static void main(String args[]) throws CustomExption{
		int i=11;
		if(i==10){
			throw new CustomExption("invalid");
		}else{
			System.out.println("correct");
		}
		
	}
	

}
