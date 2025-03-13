import java.util.Scanner;
public class ALeapYear{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.println("enter the year:");

int Year = sc.nextInt();

if(Year % 4 == 0){
System.out.println("Year is a leap ");
}

else{
System.out.println("Year is a not leap ");
}


}
}

