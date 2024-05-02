package sorting;

import java.util.*;

public class CountingSort {
    public static int  getMax(int [] arr, int size)
    {
        int max=arr[0];
        for(int i=1;i<size;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void Counting(int [] arr, int size)
    {
        int [] output=new int[size+1];
        int max=getMax(arr,size);
        int [] count=new int[max+1];

    for(int i=0;i<=max;i++)
    {
        count[i]=0;
    }
    for(int i=0;i<size;i++)
    {
        count[arr[i]]++;
    }
    for(int i=1;i<=max;i++)
    {
        count[i]+=count[i-1];
    }
    for(int i=size-1;i>=0;i--)
    {
        output[count[arr[i]]-1]=arr[i];
        count[arr[i]]--;
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
        for (int i = 0; i <size; i++) {
            array[i] = input.nextInt();
        }
        Counting(array,size);
        show(array);
    }
}
