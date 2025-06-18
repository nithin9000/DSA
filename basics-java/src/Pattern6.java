import java.util.*;

public class Pattern6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = num;i>=1;i--){
            System.out.println("*".repeat(i));
        }
    }
}