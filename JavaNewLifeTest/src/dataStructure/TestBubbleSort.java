package dataStructure;

public class TestBubbleSort {
public static void main(String args[]){
	int arr[]={2,5,3,6,4};
	BubbleSort bs=new BubbleSort();
	bs.sortArr(arr);
	int i=0;
	while(i<arr.length){
		System.out.println(arr[i]);
		i++;
	}
	
	BinarySearch br=new BinarySearch();
	System.out.println(br.binSearch(arr, 6));
	
	
	}	
}

class BubbleSort{
	public int [] sortArr(int [] arr){
	int n=arr.length;
	for(int m=n;m>=0;m--){	
		for(int j=0;j<n-1;j++){
			int k=j+1;
			if(arr[j]>arr[k]){
				int temp=arr[j];
				arr[j]=arr[k];
				arr[k]=temp;
			}	
		}
		
	}	
		return arr;
	}
}
class BinarySearch{
	public String binSearch(int [] arr,int value){
		boolean check=false;
	
		int start=0;
		int end=arr.length-1;
		int postion=0;;
		
		while(start<=end){
			int mid=(start+end)/2;
			if(arr[mid]==value){
				postion=mid;
				check=true;
			}
			if(arr[mid]<value){
				start=mid+1;
			}else{
				end=mid-1;
			}
			
			
		}
	    
		
		if(check){
			return "found"+postion;
		}else{
			return "not found"+postion;
		}
		
	}
}