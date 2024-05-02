package sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void insertion(int arr[],int size)
    {
        for(int i=1;i<size;i++)

        {
            int pivot=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>pivot)
            {
                arr[j+1]=arr[j];
                j=j-1;
                arr[j+1]=pivot;
            }
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
        insertion( array,size);
        show(array,size);

    }
}
