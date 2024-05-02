package Staticexample;

public class Human {
        int age;
        int salery;
        ;
        String name;
        boolean marriage;

        static int population;
        Human(int age,int salery,String name,boolean marriage)
        {
            this.age=age;
            this.salery=salery;
            this.marriage=marriage;
            this.name=name;
            population++;
        }

    }
