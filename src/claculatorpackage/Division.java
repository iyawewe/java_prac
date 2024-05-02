package claculatorpackage;
import java.util.Scanner;

public class Division {
    public  void div() {
        System.out.println("enter any two numbers to be divided");
        Scanner input=new Scanner(System.in);
        int a;
        int b;
        a=input.nextInt();
        b=input.nextInt();
        int div=a%b;
        System.out.println("the remainder of the 2 number is"+div);
    }
}
