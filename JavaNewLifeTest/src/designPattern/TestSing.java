package designPattern;

import designPattern.SingltonExp;


public class TestSing {
public static void main(String args[]) throws InterruptedException{
	
	SingltonExp singltonExp=SingltonExp.getSingleIntance();
Thread.sleep(5000);
SingltonExp singltonExp1=SingltonExp.getSingleIntance();

}
}
