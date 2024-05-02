    package sorting;

import java.util.Scanner;

 public class LinearSearch {
    int linear(int arr[], int key) {

        if (arr.length == 0) {
            return 0;
        }
        else
        {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==key)
                {
                    return i;
                }
            }
            return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("enter the elements in the array");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        int temp;
        System.out.println("enter the element to be found");
        temp = input.nextInt();
        LinearSearch obj=new LinearSearch();
        obj.linear(array, temp);
        int result = obj.linear(array, temp);
        if (result != -1 && result!=0) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }

    }
}

