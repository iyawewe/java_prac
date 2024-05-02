public  class Count {
     static int countt;
    int a=1;
    Count()
    {
        System.out.println("show function being called "+a+"times");
        countt++;
    }
    void  show()
    {
        System.out.println(countt);
    }
    public  static void main(String[] args) {
        Count c1=new Count();
        Count c2=new Count();
        Count c3=new Count();
        Count c=new Count();
        c.show();
    }

}

