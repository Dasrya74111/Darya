package It.Ihu.unit02.main;

import static java.lang.Math.pow;

public class Task03 {

	public static void main(String[] args) {
		
	double a;
	double b;
	double c;
	
	double result;
	
	a = 2.0;
	b = 3.0;
	c = 4.0;
	
	double temp; 
	temp = Math.pow(a, 2) - pow(b - c, 2); 
	
	result = temp + Math.log(pow(b, 2) + 1);
	
	System.out.println("result = " + result);
	}

}
