package inheritance;

public class Box {
    int length;
    int wide;
    int height;
    Box()
    {
        length=1;
        wide=2;
        height=3;
    }
    Box(int l,int w, int h)
    {
        length=l;
        wide=w;
        height=h;
    }
    Box(Box obj){
        this.length=obj.length;
        this.wide= obj.wide;
        this.height=obj.height;

    }
}
