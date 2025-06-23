package hashing;

public class SelectionSort {
    static void selection_sort(int arr[],int n){
        for(int i = 0;i<n-1;i++){
            int mini = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After selection Sort");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int [] arr = {12,45,2,11,10,34,99};
        int n = arr.length;
        selection_sort(arr,n);
    }
}
