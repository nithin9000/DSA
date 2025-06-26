package hashing;

public class InsertionSort {
    static void insertion(int[] arr,int n){
        for(int i = 0;i<n;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {34, 1, 43, 23, 29, 19, 12};
        //int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(arr.length);
        insertion(arr, arr.length);
    }
}
