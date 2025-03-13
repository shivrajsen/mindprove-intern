import java.util.Scanner;

public class BasicStringValidation{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
	
	String gmail = "shivrajsendhav.ep@gmal.com";
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        
	if(email.equals(gmail)){
		System.out.println("Login Success");
	}else{
		System.out.println("Invalid Credentials");
	}

        

        scanner.close();
    }
}
