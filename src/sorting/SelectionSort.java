package sorting;

import java.util.Scanner;

public class SelectionSort {

    public  static void selection( int arr[], int size)
    {
        int smallest;
        for(int i=0;i<size;i++)
        {
            smallest=i;
            for(int j=i+1;j<size;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
    }
     static void show(int arr[], int size)
    {
        System.out.println("the sorted array is");
        int i=0;
        while (i<size) {
            System.out.println(arr[i]);
            i++;
        }
        System.out.println();
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
        selection(array, size);
        show(array, size);
    }
}
