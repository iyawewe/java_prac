package sorting;
import java.util.*;
public class MergeSort {
    public static void merge(int[] arr, int low,int mid, int high) {//4 argument
        int i=low;
        int[] temp=new int[arr.length];
        int j=mid+1;
        int k=low;
        while(i<=mid && j<=high)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i=i+1;
            }
            else
            {
                temp[k]=arr[j];
                j=j+1;
            }
            k=k+1;
        }
        while (i<=mid)
        {
            temp[k]=arr[i];
            i=i+1;
            k=k+1;
        }
        while(j<=high)
        {
            temp[k]=arr[j];
            k=k+1;
            j=j+1;
        }
        for(int x=0;x<arr.length;x++)
        {
            arr[x]=temp[x];
        }
    }
public  static void mergesort(int[] arr,int low,int high)
{
    if(low<high)
    {
       int mid=(low+high)/2;
        mergesort(arr,low,mid);//3 argument, above i gave 4 argument
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
}
public static void show(int[] arr,int size)
{
    System.out.println("array is");
    for(int x=0;x<size;x++) {
        System.out.println(arr[x]);
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
        mergesort(array,0, array.length);
        show(array,array.length);
    }
}
