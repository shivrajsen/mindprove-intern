import java.util.Scanner;

public class SimpleValidation{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String userEmail = scanner.nextLine();

        System.out.print("Enter Password: ");
        String userPassword = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String userPhone = scanner.nextLine();

        boolean isEmailValid = userEmail.matches("^a-z0-9@.") && userEmail.endsWith("@gmail.com");
        boolean isPasswordValid = userPassword.matches("^[a-z0-9@]+$");
        boolean isPhoneValid = userPhone.matches("^[0-9]{10}$");

        if (isEmailValid && isPasswordValid && isPhoneValid) {
            System.out.println("Login Successful.");
        } else {
            System.out.println("Something else wrong! Please check your details.");
        }

        scanner.close();
    }
}
