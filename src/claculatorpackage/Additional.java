package claculatorpackage;
import java.util.Scanner;
public class Additional {
    public void Sum()
    {
        System.out.println("enter any two numbers to be added");
        Scanner input=new Scanner(System.in);
        int a;
        int b;
        a=input.nextInt();
        b=input.nextInt();
        int sum=a+b;
        System.out.println("the sum of the 2 number is"+sum);
    }
}
