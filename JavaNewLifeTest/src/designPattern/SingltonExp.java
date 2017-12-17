package designPattern;


import java.io.Serializable;

public class SingltonExp implements Cloneable ,Serializable{

	private volatile static SingltonExp singltonExp;
	private SingltonExp(){
		System.out.println("this is new object");
	}
	
	public static SingltonExp getSingleIntance(){
		if(singltonExp==null){
			synchronized (SingltonExp.class) {
				if(singltonExp==null){
				singltonExp=new SingltonExp();
				}
			}
		}
		return singltonExp;
	}
	
	public Object readResolve(){
		return getSingleIntance();
	}
	
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
	
}
