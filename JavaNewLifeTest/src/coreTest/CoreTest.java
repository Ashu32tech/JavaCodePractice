package coreTest;

public class CoreTest {
	
	public static void main(String args[]){
		int a[]={1,2,3,4,5,6,7,8,10};
		int sum=0;
		for(int j:a){
			sum+=j;
		}
		int nextSum=(10*(10+1))/2;
		
		int missNum=nextSum-sum;
		System.out.println(missNum);
		
	}
}
