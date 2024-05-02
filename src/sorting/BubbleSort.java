package sorting;
import java.util.*;
public class BubbleSort {
    static void bubblesort(int arr[], int size) {
        int temp;
        //boolean swap;
        for (int i = 0; i < size ; i++) {
            // swap=false;
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // swap=true;

                }
            }
        }
    }
     static void show(int arr[])
    {
        System.out.println("array is sorted");
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
        bubblesort(array,size);
        show(array);

    }
}