package inheritance;

public class Main extends Box {
    public static void main(String[] args) {
        Box obj1=new Box();
        System.out.println("Box class first object");
        System.out.println(obj1.length+" "+obj1.wide+" "+ obj1.height);

        Box obj2=new Box(5,6,7);
        System.out.println("Box class second object");
        System.out.println(obj2.length+" "+ obj2.wide+" "+ obj2.height);

        Box obj3=new Box(obj1);
        System.out.println("Box class third object");
        System.out.println(obj3.length+" "+ obj3.wide+" "+ obj3.height);

        BoxWeight obj4=new BoxWeight();
        System.out.println("BoexWeight class  first object");
        System.out.println(obj4.length+" "+ obj4.wide+" "+ obj4.height+" "+obj4.weight);

        BoxWeight obj5=new BoxWeight();
        System.out.println("BoexWeight class second object");
        System.out.println(obj5.length+" "+ obj5.wide+" "+ obj5.height+" "+obj5.weight);

        BoxWeight obj6=new BoxWeight(9,8,7,10);
        System.out.println("BoexWeight class third object");
        System.out.println(obj6.length+" "+ obj6.wide+" "+ obj6.height+" "+obj6.weight);

    }
}

