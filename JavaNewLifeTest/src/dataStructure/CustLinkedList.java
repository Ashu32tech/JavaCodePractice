package dataStructure;

public class CustLinkedList {

	public static void main(String args[]){
		SinglyLinkedListImpl<Integer> singleTem=new SinglyLinkedListImpl<Integer>();
		singleTem.add(1);
		singleTem.add(2);
		singleTem.add(3);
		singleTem.add(4);
		
		singleTem.traverse();
		
	}
	
}

class SinglyLinkedListImpl<T>{
	private Node<T> head;
	private Node<T> tail;
	public void add(T element){
		Node<T> nd=new Node<T>();
		nd.setValue(element);
		if(head==null){
			head=nd;
			tail=nd;
		}else{
			tail.setNextRef(nd);
			tail=nd;
		}
	}
	public void traverse(){
		Node<T> temp=head;
		while(true){
			if(temp==null){
				break;
			}else{
				System.out.println(temp.getValue());
				temp=temp.getNextRef();
			}
			
		}
	}
}


class Node<T>{

	private Node<T> nextRef;
	private T value;
	public Node<T> getNextRef() {
		return nextRef;
	}
	public void setNextRef(Node<T> nextRef) {
		this.nextRef = nextRef;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}	
}
