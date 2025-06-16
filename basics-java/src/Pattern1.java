/*
Example 1:
Input: N = 3
Output:
* * *
* * *
* * *


Example 2:
Input: N = 6
Output:
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *

Time complexity - O(N^2)
 */

import java.util.*;
public class Pattern1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 'N' Value: ");
        int n = scan.nextInt();

        for(int i = 1;i<=n;i++){
            System.out.println("*".repeat(n));
        }
    }

}