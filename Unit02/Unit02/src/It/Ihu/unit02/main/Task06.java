package It.Ihu.unit02.main;

public class Task06 {

	public static void main(String[] args) {
		
	double a, b, c, d;
	double result;
	
	a = 8.0;
	b = 8.0;
	c = 7.0;
	d = 2.0;
	
	double temp;
	temp = (a / c) * (b / d);
	
	double dog;
	dog = (a * b - c) / (c * d);
	
	result = temp - dog;
	
	System.out.println("result = " + result);

	}

}
