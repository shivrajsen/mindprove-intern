import java.util.Scanner;
public class CheckWhetherANumber{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the number: ");

int Num = sc.nextInt();

if(Num % 2 == 0){
System.out.println("Number is even  ");
}


 
else{
System.out.println("the numbr is odd");
}


}
}