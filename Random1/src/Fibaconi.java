public class Fibaconi{
     static void fibn(int n, int prev1,int prev2)
    {
        if(n<3)
        {
            return;
        }
        int num=prev1+prev2;
        prev2=prev1;
        prev1=num;
        System.out.println(num);
        fibn(n-1,prev1,prev2);
    }
    public static void main(String[] args) {
        System.out.println("0");
        System.out.println("1");
         fibn(8,1,0);
    }
}

