package It.Ihu.unit02.main;

import static java.lang.Math.pow;

public class Task07 {

	public static void main(String[] args) {
		
	double a;
	double b;
	double c;
	
	a = 2;
	b = 3;
	c = - 9;
	
	double P, Y, U;
	
	if (a>=0) {
	    P = Math.pow(a, 2);
	    System.out.println("а в квадрате = " + P);
	} else {
		P = Math.pow(a, 4);
		System.out.println("а в четвертой степени = " + P);
	}
			
	if (b>=0) {
	    Y = Math.pow(b, 2);
	    System.out.println("b в квадрате = " + Y);
	} else {
		Y = Math.pow(b, 4);
		System.out.println("b в четвертой степени = " + Y);
	}
	
	if (c>=0) {
	    U = Math.pow(c, 2);
	    System.out.println("c в квадрате = " + c);
	} else {
		U = Math.pow(c, 4);
		System.out.println("c в четвертой степени = " + U);
	}
	
	}

}
