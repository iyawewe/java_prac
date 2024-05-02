 class  Subarray {
    public static void printSubarray(int arr[], int n) {
        int max=arr[0];
        int sum=arr[0];
        int temp=arr[0];
    for (int i = 1; i < n; i++) {
        if(temp<arr[i]){
            temp=arr[i];
        }
        if(sum<arr[i]){
            max=arr[i];
        }
                sum=sum+arr[i];
                if(max<sum){
                    max=sum;
                }
                if(max<temp){
                    max=temp;
                }
            }
    System.out.println("The maximum sum is:"+max);
    }
    public static void main(String args[]) {
        int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
        int n =9;
//        Subarray ar=new Subarray();
        Subarray.printSubarray(arr, n);
    }
}
