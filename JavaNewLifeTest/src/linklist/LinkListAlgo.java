package linklist;

public class LinkListAlgo<T> {
	Node<T> head;
	Node<T> tail;
	void add(T element){
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
	void traverse(){
		Node<T> temp=head;
		while(true){
		if(temp.nextRef==null){
		System.out.println(temp.getValue());
			break;
		}else{
			System.out.println(temp.getValue());
			temp=temp.nextRef;
		}
		}	
	}
	
	T middleElit(){
		Node<T> current=head;
		Node<T> mid=head;
		int length=0;
		while(true){
			length++;
			if(current.nextRef==null){
		
				break;
			}else{
			
			
				if(length%2==0){
					mid=mid.nextRef;
				}
				
				current=current.nextRef;
			}
			}
		
		return mid.getValue();	
	}
	
	
			public static void main(String args[]){
			
				LinkListAlgo<Integer> testLink=new LinkListAlgo<Integer>();
				testLink.add(1);
				testLink.add(2);
				testLink.add(3);
				testLink.add(4);
				testLink.add(5);
				testLink.add(6);
				testLink.add(7);
				testLink.traverse();
				System.out.println(testLink.middleElit());
				}
}

class Node<T>{
			Node<T> nextRef;
			T value;
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