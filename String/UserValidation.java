import java.util.Scanner;

public class UserValidation{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String savedEmail = "shivrajsendhav.ep@gmail.com";
        String savedPassword = "MindProve@123";
        String savedPhoneNumber = "9876543210";

        System.out.print("Enter Email: ");
        String userEmail = scanner.nextLine();

        System.out.print("Enter Password: ");
        String userPassword = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String userPhone = scanner.nextLine();

        if (userEmail.equals(savedEmail) && userPassword.equals(savedPassword) && userPhone.equals(savedPhoneNumber)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Credentials");
        }

        scanner.close();
    }
}
