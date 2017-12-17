package Decorator;


interface Car{
	public void assembler();
}

class BasicCar implements Car{

	@Override
	public void assembler(){
		System.out.println("Basic car");
	}
}

class CarDecorator implements Car{
	
	protected Car c;
	CarDecorator(Car c){
		this.c=c;
		
	}

	@Override
	public void assembler() {
		this.c.assembler();
		
	}
	
}

class SportCar extends CarDecorator{

	SportCar(Car c) {
		super(c);
	}
	
	@Override
	public void assembler() {
		super.assembler();
		System.out.println("add feature sporty");
	}
}

class LuxryCar extends CarDecorator{ 

  LuxryCar(Car c) {
	super(c);
}

@Override
public void assembler() {
	super.assembler();
	System.out.println("add feature luxry");
}
}




public class DecoratorPatternTest{

	public static void main(String args[]){
		Car spc=new SportCar(new BasicCar());
		spc.assembler();
		Car lxc=new LuxryCar(new BasicCar());
		lxc.assembler();
	} 
	
	
}
