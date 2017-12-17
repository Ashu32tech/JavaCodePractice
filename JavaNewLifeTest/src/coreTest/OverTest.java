package coreTest;

import java.io.IOException;

public class OverTest{
	void mse() throws IOException{
		System.out.println("it is i test 1");
	}
}

class OverTest1 extends OverTest{
	void mse() throws NullPointerException{
		System.out.println("it is in first 2");
	}
}
