import java.util.Scanner;
public class CheckWhether{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the number: ");

int Num = sc.nextInt();

if(Num % 5 == 0){
System.out.println("Number is divisible by 5. ");
}

else if(Num % 11 == 0){
System.out.println("Number is divisible by 11. ");
}
 
else{
System.out.println("Number is neither divisible by 5 or 11");
}


}
}