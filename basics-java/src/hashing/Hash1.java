/*
Example 1:
Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
	 5  2
        15  1
Explanation: 10 occurs 3 times in the array
	      5 occurs 2 times in the array
              15 occurs 1 time in the array

Example2:
Input: arr[] = {2,2,3,4,4,2};
Output: 2  3
	3  1
        4  2
Explanation: 2 occurs 3 times in the array
	     3 occurs 1 time in the array
             4 occurs 2 time in the array

Time Complexity: O(K);

 */
package hashing;

import java.util.*;
public class Hash1 {
    public static void main(String[] args){
        int arr[] = {10,5,10,15,10,5};
        int n = arr.length;
        Frequency(arr,n);
    }
    static void Frequency(int arr[],int n){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(map.containsKey(arr[i])){
              map.put(arr[i],map.get(arr[i])+1);
              //  System.out.println(map.get(arr[i]));
            }else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }

    }
}
