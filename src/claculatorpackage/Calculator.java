package claculatorpackage;

public class Calculator {
    public static void main(String[] args) {
        Additional objA=new Additional();
        Subtraction objB=new Subtraction();
        Multiplication objM=new Multiplication();
        Division objD=new Division();
        objA.Sum();
        objB.sub();
        objM.multi();
        objD.div();

    }
}
