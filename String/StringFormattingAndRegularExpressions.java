public class StringFormattingAndRegularExpressions{

	public static void main(String[]args){
	
	String name = "SHIVRAJ";
		int age = 18;
	
	String formattedString = String.format("My Name is %s and I am %d years old.", name , age);
	
		System.out.println(formattedString); 
	}
}