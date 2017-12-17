package immutable;

public final class Contacts {
	private final int id;
	private final String name;
	
	public Contacts(int id,String name){
		this.id=id;
		this.name=name;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public static void main(String args[]){
		Contacts contacts=new Contacts(1,"abc");
		System.out.println(contacts.getId());
		System.out.println(contacts.getName());
	}
}
