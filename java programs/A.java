
import java.util.Scanner;
class A{

public static void main(String []args)
{

Scanner s=new Scanner(System.in);

 System.out.print("Enter a number: ");
        int c = s.nextInt();


//int c=13432;
int count=0;
while(c>0)
{
c=c/10;
count ++;


}
System.out.println("The number of digite in : "+count);

}


}