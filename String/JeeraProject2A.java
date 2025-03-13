public class JeeraProject2A{

	public static void main(String[]args){
	
	String name = "SHIVRAJ";
		
	int age = 18;
	
		String formattedString = String.format("My Name is %s and I am %d years old.", name , age);
	
			System.out.println(formattedString); 
	
	String []  word = {"@mindprove123", "MINDPROVE", "Java!WORLD"};
	
		for(String w : word){	
	
		boolean isMatch = w.matches("[A-Za-z0-9]+");
		
			System.out.println(w+" -:Matches is:- "+isMatch);
	}
	
	String sentence = "KT institute is! Good *=option= FOr (learning)";
		
		String result = sentence.replaceAll("[^A-Za-z]","");
		
			System.out.println(result);
	
	String line = "@mind#prove$technologies%private&limited*Indore";
	
		String [] words = line.split("[@#$%&*]");
	
			for(String w : words){
				
				System.out.println(w);
			}
		// STRING BUFFER START
		
	//APPEND
	
	StringBuffer sb = new StringBuffer("Hello");
		
		sb.append(" World");
			
			System.out.println(sb); 
	
	// INSERT()
	
	StringBuffer ins = new StringBuffer("Hello");
		
		ins.insert(5, " Java");
			
			System.out.println(ins);
	
	// DELETE()
	
	StringBuffer dlt = new StringBuffer("Hello Java");
		
		dlt.delete(5, 10);
		
			System.out.println(dlt);
	
	//REVERSE()
	
	StringBuffer rvrs = new StringBuffer("Hello.Java");
		
		rvrs.reverse();
			
			System.out.println(rvrs);
	
	//CAPACITY()
	
	StringBuffer cpct = new StringBuffer();	// Capacity formula first Capacity by default 16
		
					// 16*2+2 ha, if literal length under 16 out same
						
					// if more then 16 so formula exported 16*2+2=34 is next Capacity
	cpct.append("Hello World");
		System.out.println(cpct.capacity());
	
		// STRING MANIPULATE EXAMPLE'S
		
	// REVERSE
	
	String strrv = "MindProve";

		String rev = new StringBuilder(strrv).reverse().toString();

			System.out.println("Reversed String: " + rev);
		
		// REMOVE DUPLECATES
		
	String removeduplicate = "Programming";
	
		StringBuilder output = new StringBuilder();

	for (char c : removeduplicate.toCharArray()) {
    		
	if (output.indexOf(String.valueOf(c)) == -1) { 
        	
	output.append(c);
    }
}

		System.out.println("String after removing duplicates: " + output);
		
		// COUNT VOVELS AND CONSTANT 
	
	String givenText = "Education".toLowerCase();
	int vowelCount = givenText.replaceAll("[^aeiou]", "").length();
	int consonantCount = givenText.replaceAll("[^bcdfghjklmnpqrstvwxyz]", "").length();

		System.out.println("Vowels: " + vowelCount);
		System.out.println("Consonants: " + consonantCount);
	
		// CHEKING STRING IS PELINDROME
	
	String wordToCheck = "madam";
	boolean isPalindrome = wordToCheck.equals(new StringBuilder(wordToCheck).reverse().toString());
		System.out.println(isPalindrome ? "Palindrome" : "Not a Palindrome");
	
		// CONVERT SENTENCE TO TITLE CASE
	
	String sentance = "welcome to mindprove";

		String titleCase = sentance.substring(0, 1).toUpperCase() + sentance.substring(1);

			System.out.println("Title Case: " + titleCase);

	



	
	}
}