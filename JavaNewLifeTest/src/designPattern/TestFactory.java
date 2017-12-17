package designPattern;

class CurrencyFactory {
	public static Currency createCurrency (String country){
	if(country.equals("INDIA")){
		return new Rupee();	
	}else if(country.equals("US")){
		return new USDoller();		
	}else if(country.equals("UK")){
		return new UKDoller();
	}
	throw new IllegalArgumentException("No such currency");
	}
}


public class TestFactory{
	public static void main(String args[]){
		String country="UK";
		Currency curr=CurrencyFactory.createCurrency(country);
		System.out.println(curr.getSymbol());
	}
}





