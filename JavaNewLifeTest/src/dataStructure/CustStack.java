package dataStructure;

public class CustStack {

	int top;
	int stackSize;
	int[] StackArr;
	
	CustStack(int stackSize){
		top=-1;
		this.stackSize=stackSize;
		this.StackArr=new int[stackSize];
		
	}
	
	boolean isStackEmpty(){
		if(top==-1){
			return true;
		}else{
			return false;
		}
	}
	boolean isStckFull(){
		if(top==stackSize-1){
			return true;
		}else{
			return false;
		}
	}
	void push(int Entry) throws Exception{
		if(isStckFull()){
			throw new Exception("Stack s full");
		}else{
			StackArr[++top]=Entry;
		}
	}
	int pop() throws Exception{
		if(isStackEmpty()){
			throw new Exception("Stack is Empty");
		}else{
			int entry=StackArr[top--];
			return entry;
		}
	}
	
	int peak(){
		return StackArr[top];
	}
	public static void main(String args[]) throws Exception{
		CustStack custStack=new CustStack(5);
		custStack.push(1);
		custStack.push(2);
		custStack.push(3);
		custStack.push(4);
		custStack.push(5);
		//custStack.push(6);
		System.out.println(custStack.pop());
		System.out.println(custStack.pop());
		System.out.println(custStack.pop());
		System.out.println(custStack.pop());
		System.out.println(custStack.pop());
		System.out.println(custStack.pop());
	}
	
}
