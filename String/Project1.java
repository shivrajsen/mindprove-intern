public class Project1{
	public static void main(String[]args){
	int num1 = Math.max(2,10);
		System.out.println(" Max Value, :"+num1);	// returs max value.

	int num2 = Math.abs(-123);
		System.out.println(" Absolute Value is, :"+num2);	// returns Positive Value.
	
	int num3 = Math.decrementExact(-123);
		System.out.println("Exact Decremnt is, :"+num3); // returs decriment value 5==4, 10==9.
		
	float num4 = Math.getExponent(12);
		System.out.println("Exponent value in float is, :"+num4); // returns Exponent value in float. 
	
	double num5 = Math.floorDiv(45000,900); // returns E^x Double
		System.out.println("Round division, :"+num5);	
	
	double num6 = Math.exp(1);
		System.out.println("math.exp, :"+num6);
	
	double num7 = Math.log10(10000000);
		System.out.println("Log base 10, :"+num7);
	
	double num8 = 90*Math.PI/180;
		System.out.println("Tegnametric Function, :"+num8);
	
	double num9 = Math.toRadians(90);
		System.out.println("The Radians by Degree, :"+num9);
	
	double num10 = Math.toDegrees(4);
		System.out.println("The Degree by radians, :"+num10);
	
	double num11 = Math.cbrt(15625); // Return out 3*3*3 = 27; like this. 
		System.out.println("The cude Root, :"+num11);
	
	double num12 = Math.tanh(123);     // Return Hybertanic sign of value.
		System.out.println("math.tanh,  :"+num12);
	
	double num13 = Math.random();
		System.out.println("The Random number is, :"+num13);
	
	double num14 = Math.pow(4,5);	// pow is like 4*4*4*4*4 jitni power hogi utna mulple time hoga
		System.out.println("The pow is, :"+num14);
	
	int num15 = Math.multiplyExact(100,200); 	// 100*200=20000 return exact multiply in range
		System.out.println("The Exact multiply is, :"+num15);
	
	double num16 = Math.nextAfter(15.5,16);	// Return next number
		System.out.println("The Next After number is, :"+num16);
	
	
	}
}