package enumu;
enum Season{
	 WINTER(1),SUMMER(2),SPRING(3),AUTOUMN(4);
	 
	 private int value;
	 private Season(int value){
		 this.value=value;
	 }
	 
	 public int getValue(){
		 return value; 
	 }
}
public class ExampleEnum {	
 public static void main(String args[]){
	 for(Season season:Season.values()){
			System.out.println(season);	
			System.out.println(season.getValue());	
			System.out.println(season.ordinal());
	 }
	 
	 
	 Season season=Season.WINTER;
	 switch(season){
	 case WINTER:
		 System.out.println("this is WINTER");
		 break;
	 case SUMMER:
		 System.out.println("this is SUMMER");
		 break;	
	 default:
		 System.out.println("this is default");
		 break;	 
		 
	 }	 
 }
}
