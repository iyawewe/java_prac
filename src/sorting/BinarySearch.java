package sorting;

import java.util.Scanner;

public class BinarySearch {

    public  static int binarysearch(int arr[], int key, int low, int high)
    {
        int mid=(low+high)/2;
        if(arr.length==0)
        {
            return 0;
        }
        else {
            if(arr[mid]==key)
            {
                System.out.println("key found");
                return mid;
            }
            mid=(low+high)/2;
            if(arr[mid]<key)
            {
                return binarysearch(arr, key,mid+1,high);
            }
            else if(arr[mid]>key)
            {
               return binarysearch(arr,key,low,mid-1);
            }
            //5 else return -1;
        }
        return mid;
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
        int low=0;
        int high= array.length;
        binarysearch(array,temp,low,high);
        int result=binarysearch(array,temp,low,high);
        if(result!=0) {
            System.out.println("key found" + result);
        }
        else
            System.out.println("no found");

    }
}
