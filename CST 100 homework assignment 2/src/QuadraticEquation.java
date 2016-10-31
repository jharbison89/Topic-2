
public class QuadraticEquation {

	private double a, b, c;
	
	QuadraticEquation(double x, double y, double z){
		a = x;
		b = y;
		c = z;
	}
	
	double getA(){
		return a;
	}
	
	double getB(){
		return b;
	}
	
	double getC(){
		return c;
	}
	
	double getDiscriminant(){
		return ((Math.pow(b, 2)) -(4 * a * c));
	}
	
	double getRoot1(){
		if((Math.pow(b, 2)) -(4 * a * c) >= 0){
			return (-b + Math.sqrt((Math.pow(b, 2.0)) -(4 * a * c)))/(2 * a);
		}
		else{
			return 0;
		}
	}
	
	double getRoot2(){
		if((Math.pow(b, 2)) -(4 * a * c) >= 0){
			return (-b - Math.sqrt((Math.pow(b, 2.0)) -(4 * a * c)))/(2 * a);
		}
		else{
			return 0;
		}
	}
}
