package hashing;

public class SelectionSort2 {
    static void sort1(int[] arr,int n){
        for(int i = 0;i<n-1;i++){
            int min1 = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[min1]){
                    min1 = j;
                }
            }
            int temp = arr[min1];
            arr[min1] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {12,34,1,43,23,29,19,12};
        System.out.println(arr.length);
        sort1(arr,arr.length);
    }
}
