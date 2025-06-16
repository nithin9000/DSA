/*
Input Format: N = 3
Result:
*
* *
* * *

Input Format: N = 6
Result:
*
* *
* * *
* * * *
* * * * *
* * * * * *
Time complexity = O(N^2)
 */
import java.util.*;
public class Pattern2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 'N' : ");
        int n = scan.nextInt();
        for(int i = 1;i<=n;i++){
            System.out.println("*".repeat(i));
        }
    }
}
