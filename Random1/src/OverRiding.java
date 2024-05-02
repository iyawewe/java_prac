public class OverRiding {

    public static void main(String[] args) {
        Parent p=new Parent();
        p.show();
        Child c=new Child();
        c.show();
        Parent obj=new Child();
        obj.show();
    }
}
class Parent{
    int a=1;
    void show()
    {
        System.out.println("parent class"+1);
    }
}
class Child extends Parent{
    int a=2;
    @Override
    void show()
    {
        System.out.println("child class"+a);
    }
}

