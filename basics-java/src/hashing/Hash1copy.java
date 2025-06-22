package hashing;
import java.util.*;

public class Hash1copy {
    public static void main(String[] args){
        int[] arr = {10,5,10,5,15,10,6};
        int n = arr.length;
        frequency(arr,n);
    }
    static void frequency(int[] arr,int n){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]+1));
            }
        }


    }
}
