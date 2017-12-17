package mislinus;

public class RecurrsionTest {
	public static void main(String args[]){
	//	String ats="ashutosh";
		//System.out.println(ats.substring(0,ats.length()-1));
		//System.out.println();
		
		RecurrsionTest rt=new RecurrsionTest();
		System.out.println(rt.reverseString("ashutosh"));
	}
	
	public void printNum(int i){
		if(i<=10){
			System.out.println(i);
			i++;
			printNum(i);
		}
	}
	
	String reverseString(String str){
		String reverse="";
		System.out.println(str.length());
		if(str.length()==1){
			return str;
		}else{
		int len=str.length();
		reverse=reverse+str.charAt(len-1)+reverseString(str.substring(0,len-1));
		return reverse;
		}
	
	}
}
