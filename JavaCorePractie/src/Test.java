
public class Test {
			
			static int midIndex(int a[]) throws Exception{
				int lastIndex=a.length-1;
				int startIndex=0;
				int leftSum=0;
				int rightSum=0;
				while(true){
					if(leftSum>rightSum){
						rightSum+=a[lastIndex--];
					}else{
						leftSum+=a[startIndex++];	
					}
					
					if(startIndex>lastIndex){
						if(rightSum==leftSum){
							break;
						}else{
							throw new Exception("not found");
						}
					}
					
				}
				return lastIndex;
		
			}	
			
			public static void main(String args[]) throws Exception{
				  int[] num = { 2, 4, 4, 5, 4, 1 };
				System.out.println(Test.midIndex(num));
			}
}
