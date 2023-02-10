package It.Ihu.unit02.main;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Task02 {

	public static void main(String[] args) {
		
		// вычисляем гипотенузу треугольника (с)
		
		double a, b;
		double c;
		
		a = 2.0;
		b = 3.0;
		
		c = sqrt(Math.pow(a,  2) + pow(b, 2)); 
		
		System.out.println("Гипотенуза = " + c);
		
		// вычисляем площадь треугольника (s)
		
		double s;
		
		s = (a + b) / 2;
		
		System.out.println("Площадь = " + s);

	}

}
