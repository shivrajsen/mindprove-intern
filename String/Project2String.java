public class Project2String{
	public static void main(String[]args){
	
	String str1 = "MIND PROVE TECHNOLOGIES";
		String str2 = new String ("MIND PROVE TECHNOLOGIES");
			System.out.println("Literal;- "+str1);
				System.out.println("New Keywords;- "+str2);

	String str3 = "TOUFIQUE AHMED KHAN ";
		str3.concat("OWNS MINDPROVE ");
			System.out.println("You Can't Change Literals with Contain;- "+str3);
		
	String str4 = "ADIL MANSOORI";
		int lgth =str4.length();
			System.out.println("The Lenght is:- "+lgth);
		
	String str5 = "SAJID MANSOORI";
		char ch = str5.charAt(3);
			System.out.println("The CharAt is:- "+ch);
	
	String str6 = "SHADAB MANSOORI";
		String sub =str6.substring(0,6);
			System.out.println("The SubString is:- "+sub);
	
	String str7 = "SHIVRAJ SENSHAV";
		boolean con = str7.contains("Thakur");
			System.out.println("The Contains which  is:- "+con);
	
	String str8A = "HASNAIN";
	String str8B= "Hasnain";
		boolean result = str8A.equals(str8B);
			System.out.println("Is equals to:- "+result);
	
	String str9A = "MindProve";
	String str9B = "MINDprove";
	String str9C = "mind PROOOF";
		
		boolean result1 = str9A.equalsIgnoreCase(str9B);
		boolean result2 = str9A.equalsIgnoreCase(str9C);
		boolean result3 = str9B.equalsIgnoreCase(str9C);
			
			System.out.println("Equal Ignore Case:- "+result1);
			System.out.println("Equal Ignore Case:- "+result2);
			System.out.println("Equal Ignore Case:- "+result3);
	
	String str10 = "KT INSTITUTE ";
		
		boolean resultA = str10.startsWith("KT");
		boolean resultB = str10.startsWith("kt");
		boolean resultC = str10.startsWith("Institute");
		boolean resultD = str10.startsWith("kT");
		boolean resultE = str10.startsWith("Kt");
			
			System.out.println("Start with:- "+resultA);
			System.out.println("Start with:- "+resultB);
			System.out.println("Start with:- "+resultC);
			System.out.println("Start with:- "+resultD);
			System.out.println("Start with:- "+resultE);
						
	String str11 = "AZAD NAGAR";
		
		boolean result1A = str11.endsWith("AZAD");
		boolean result2B = str11.endsWith("NAgar");
		boolean result3C = str11.endsWith("Nagar");
		boolean result4D = str11.endsWith("NAGAR");
		boolean result5E = str11.endsWith("AZAD NAGAR");
			
			System.out.println("Ends With:- "+result1A);
			System.out.println("Ends With:- "+result2B);
			System.out.println("Ends With:- "+result3C);
			System.out.println("Ends With:- "+result4D);
			System.out.println("Ends With:- "+result5E);
	
	String str12 = "HELLO JAVA UNIVERSE";
		
		int index1 = str12.indexOf("Heelo");
		int index2 = str12.indexOf("HELLO");
		int index3 = str12.indexOf("Hello");
		int index4 = str12.indexOf("Python");
		int index5 = str12.indexOf("KOTLIN");
		int index6 = str12.indexOf("ALLOUT");
		int index7 = str12.indexOf("JAVA");
		int index8 = str12.indexOf("WORLD");
		int index9 = str12.indexOf("UNIVERSE");
		int index0 = str12.indexOf('J');
			
			System.out.println("INDEX POSITION IS:-- "+index0);
			System.out.println("INDEX POSITION IS:-- "+index1);
			System.out.println("INDEX POSITION IS:-- "+index2);
			System.out.println("INDEX POSITION IS:-- "+index3);
			System.out.println("INDEX POSITION IS:-- "+index4);
			System.out.println("INDEX POSITION IS:-- "+index5);
			System.out.println("INDEX POSITION IS:-- "+index6);
			System.out.println("INDEX POSITION IS:-- "+index7);
			System.out.println("INDEX POSITION IS:-- "+index8);
			System.out.println("INDEX POSITION IS:-- "+index9);
	
	String str13 = "JAVA IS PROGRAMMING LANGUAGE , BUT JAVA IS VERY FUNFULL INTERESTING PROGRAMMING LANGUAGE  F  SM";
			
		int index1A = str13.lastIndexOf('M');
		int index2B = str13.lastIndexOf('B');
		int index3C = str13.lastIndexOf('F');
		int index4D = str13.lastIndexOf('P');
		int index5E = str13.lastIndexOf('I');
		int index6F = str13.lastIndexOf('V');
		int index7G = str13.lastIndexOf('Y');
		int index8H = str13.lastIndexOf('R');
		int index9I = str13.lastIndexOf('T');
		int index0J = str13.lastIndexOf('J');
		int index10K= str13.lastIndexOf('Z');
		int index11L= str13.lastIndexOf('A');
		int index12M= str13.lastIndexOf('S');
		int index13N= str13.lastIndexOf('N');
		int index14O= str13.lastIndexOf('J');
		int index15P= str13.lastIndexOf('C');
		int index16Q= str13.lastIndexOf('D');
		int index17R= str13.lastIndexOf('E');
		int index18S= str13.lastIndexOf('G');
		int index19T= str13.lastIndexOf('H');
		int index20U= str13.lastIndexOf('K');
		int index21V= str13.lastIndexOf('L');
		int index22W= str13.lastIndexOf('O');
		int index23X= str13.lastIndexOf('Q');
		int index24Y= str13.lastIndexOf('U');
		int index25Z= str13.lastIndexOf('W');
		
			
			System.out.println("LAST INDEX POSITION IS:-- "+index0J);
			System.out.println("LAST INDEX POSITION IS:-- "+index1A);
			System.out.println("LAST INDEX POSITION IS:-- "+index2B);
			System.out.println("LAST INDEX POSITION IS F:-- "+index3C);
			System.out.println("LAST INDEX POSITION IS:-- "+index4D);
			System.out.println("LAST INDEX POSITION IS:-- "+index5E);
			System.out.println("LAST INDEX POSITION IS:-- "+index6F);
			System.out.println("LAST INDEX POSITION IS:-- "+index7G);
			System.out.println("LAST INDEX POSITION IS:-- "+index8H);
			System.out.println("LAST INDEX POSITION IS:-- "+index9I);
			System.out.println("LAST INDEX POSITION IS:-- "+index10K);
			System.out.println("LAST INDEX POSITION IS:-- "+index11L);
			System.out.println("LAST INDEX POSITION IS S:-- "+index12M);
			System.out.println("LAST INDEX POSITION IS N:-- "+index13N);
			System.out.println("LAST INDEX POSITION IS:-- "+index14O);
			System.out.println("LAST INDEX POSITION IS:-- "+index15P);
			System.out.println("LAST INDEX POSITION IS:-- "+index16Q);
			System.out.println("LAST INDEX POSITION IS:-- "+index17R);
			System.out.println("LAST INDEX POSITION IS:-- "+index18S);
			System.out.println("LAST INDEX POSITION IS:-- "+index19T);
			System.out.println("LAST INDEX POSITION IS:-- "+index20U);
			System.out.println("LAST INDEX POSITION IS:-- "+index21V);
			System.out.println("LAST INDEX POSITION IS:-- "+index22W);
			System.out.println("LAST INDEX POSITION IS:-- "+index23X);
			System.out.println("LAST INDEX POSITION IS Y:-- "+index24Y);
			System.out.println("LAST INDEX POSITION IS:-- "+index25Z);
		
	String str14 = "    OPPS,GWT    ";
	
		String strimmed = str14.trim();
	
			System.out.println("Before trim:- [" + str14 + "]");
			System.out.println("After trim:- [" + strimmed + "]");
	
	String str15 = "java programming";
	
        	String upperStr = str15.toUpperCase();
		
			System.out.println("UpperCase IS :-- "+upperStr);
		
	 String str16 = "TRAIN IS LATE SO DON'T PAINIC, SORRY FOR THE INCONVENIENCE";
      
		  String lowerStr = str16.toLowerCase();  

			System.out.println("Lowercase String: " + lowerStr);
	
	 String str17 = "JAVA IS MY LIFE";
        
		String replacedStr = str17.replace('A', 'U');  

       			System.out.println("Replaced String: " + replacedStr);
	
	 String str = "Java is fun to learn";   
       
		String[] words = str.split(" ");       
		
			System.out.println("First Word: " + words[0]);  
        		System.out.println("Second Word: " + words[1]);  
        		System.out.println("Third Word: " + words[2]); 
	
		
	  String sentence = String.join(" ", "Java", "is", "fun", "to", "learn");

        				System.out.println(sentence);
			
	
	
	
}
}