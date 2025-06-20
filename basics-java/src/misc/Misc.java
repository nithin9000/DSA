package misc;

import java.util.*;
public class Misc {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        int[] hash = new int[13];
        for(int i = 0;i<n;i++){
            hash[arr[i]] += 1;
        }
        int q = scan.nextInt();
        while(q-- != 0){
            int number = scan.nextInt();
            System.out.println(hash[number]);
        }
    }


}
