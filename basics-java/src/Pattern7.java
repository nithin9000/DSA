import java.util.*;

public class Pattern7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i = num;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
