package inheritance;

public class BoxWeight extends Box {
    int weight;
    BoxWeight()
    {
        super();
        weight=99;
    }
    BoxWeight(int length,int wide, int height,int weight)
    {
        super(length,wide,height);
        this.weight=weight;
    }


}
