import java.util.*;

public class Pattern8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 1;i<=num;i++){
            int stars = 2 * i - 1;
            int spaces = (num-i);
            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<= stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
