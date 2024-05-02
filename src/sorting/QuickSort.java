package sorting;
import java.util.*;
public class QuickSort {
    public static void swap( int [] arr,int i,int j )
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int [] arr,int low, int high)
    {
        int pivot=arr[high];
        int i=low;
        for( int j=low;j<=arr.length-1;j++)
        {
            if(arr[j]<pivot)
            {
                swap(arr,i,j);
                i=i+1;
            }
        }
        swap( arr,i,high);
        return i;
    }
public static void quick(int [] arr,int low ,int high)
{
    if (low<high)
    {
         int q=partition(arr,low,high);
        quick(arr,low,q-1);
        quick(arr,q+1,high);
    }

}
public  static void show(int [] arr)
{
    System.out.println("the array is");
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
}

    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("enter the elements in the array");
        for (int i = 0; i < size; i++)
        {
            array[i] = input.nextInt();
        }
        quick( array,0,array.length-1);
        show(array);

    }
}
