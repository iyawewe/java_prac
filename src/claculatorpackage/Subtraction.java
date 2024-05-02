package claculatorpackage;
import java.util.Scanner;

public class Subtraction {
    public void sub()
    {
        System.out.println("enter any two numbers to be subtracted");
        Scanner input=new Scanner(System.in);
        int a;
        int b;
        a=input.nextInt();
        b=input.nextInt();
        int sub=a-b;
        System.out.println("the sub of the 2 number is"+sub);

    }
}
