package hashing;
import java.util.*;

public class Slidingwindow {
    public static int findmaxconssum(int arr[],int n,int k ){
        int currsum = 0;
        for(int i = 0;i<k;i++){
            currsum += arr[i];
        }
        int maxsum = currsum;
        for(int i = k;i<n;i++){
            currsum = currsum-arr[i-k]+arr[i];
            maxsum = Math.max(maxsum,currsum);
        }
        return maxsum;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,6};
        int n = 7;
        int k = 2;
        System.out.println(findmaxconssum(arr,n,k));

    }

}
