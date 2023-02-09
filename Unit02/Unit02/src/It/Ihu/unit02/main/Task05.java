package It.Ihu.unit02.main;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;;

public class Task05 {

	public static void main(String[] args) {
		
	double a, b, c;
	double result;
	
	a = 1.0;
	b = 11.0;
	c = 3.0;
	
	double temp;
	temp = (b + sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a;
	
	result = temp - Math.pow(a, 3) * c + b;
	
	System.out.println("result = " + result);
	}

}
