package coreTest;

public class AshuLinkedList {
	public static void main(String args[]){
		AddTravelLinkList<Integer> atll=new AddTravelLinkList<>();
		atll.addElement(1);
		atll.addElement(2);
		atll.addElement(3);
		atll.addElement(4);
	atll.traverse();	
		
	}
}
class AddTravelLinkList<T>{
	Node<T> head;
	Node<T> tail;
	
	void addElement(T element){
		Node<T> node=new Node<T>();
		node.setValue(element);
		if(head==null){
		    head=node;
		    tail=node;
		}else{
			tail.setNextRef(node);
			tail=node;
		}
	}
	void traverse(){
		Node<T> tempNode=head;
		while(true){
			if(tempNode==null){
				break;
			}else{
				System.out.println(tempNode.getValue());
				tempNode=tempNode.getNextRef();
			}
		}
	}
}

class Node<T>{
	T value;
	Node<T> nextRef;
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getNextRef() {
		return nextRef;
	}
	public void setNextRef(Node<T> nextRef) {
		this.nextRef = nextRef;
	}
	
}