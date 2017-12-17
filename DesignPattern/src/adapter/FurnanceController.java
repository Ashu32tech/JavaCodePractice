package adapter;

public class FurnanceController {
	  /**
     * this method accepts heat in Fahrenheit format
     * @param heatLevel
     */
    public void changeFurnanceTemperature(int heatLevel){
        System.out.println("heat the furnance in farenhite.."+heatLevel);
    }
    public static void main(String args[]){
    	FurnanceRegulatorySystem frs=new FurnanceRegulatorySystem();
    	frs.regulateFurnanceTemperature();
    }
}
class FurnanceControllerAdapter extends FurnanceController{
	 
    /**
     * this method access temperature only in centigrade format
     * @param heatLevel
     */
    public void controlFurnance(int heatLevel){
        // convert temperature from centigrade to fahrenheit formate
        heatLevel = (heatLevel - 32)*5/9;
        changeFurnanceTemperature(heatLevel);
    }
}

class FurnanceRegulatorySystem {
	 
    public void regulateFurnanceTemperature(){
        /**
         * here some lines of code gives temperature in centigrade format
         */
        FurnanceControllerAdapter fca = new FurnanceControllerAdapter();
        fca.controlFurnance(300);
    }
}

