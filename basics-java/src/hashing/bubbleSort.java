package hashing;

public class bubbleSort {
    static void bubble(int[] arr,int n){
        for(int i = n-1;i>=1;i--){
            boolean swap = false;
            for(int j = 0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
            System.out.println("Run");
        }
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {34,1,43,23,29,19,12};
        //int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(arr.length);
        bubble(arr,arr.length);
    }
}
