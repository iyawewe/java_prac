package claculatorpackage;
import java.util.Scanner;

public class Multiplication {
    public void multi()
    {
        System.out.println("enter any two numbers to be multiplied");
        Scanner input=new Scanner(System.in);
        int a;
        int b;
        a=input.nextInt();
        b=input.nextInt();
        int multi=a*b;
        System.out.println("the multiplication of the 2 number is"+multi);
    }

}
