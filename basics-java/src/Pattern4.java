/*
Input Format: N = 3
Result:
1
1 2
1 2 3

Input Format: N = 6
Result:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6

Time complexity =
 */

import java.util.*;

public class Pattern4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
