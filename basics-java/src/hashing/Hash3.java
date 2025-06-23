package hashing;
import java.util.*;

public class Hash3 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = 7;
        String[] arr = new String[n];
        System.out.println("Enter the Names(not more than 8: ");
        for(int i = 0;i<n;i++){
            arr[i] = scan.next();
        }
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        System.out.println("Enter the name to search");
        String find = scan.next();
        if(set.contains(find)){
            System.out.println("Name found");
        }else{
            System.out.println("Not found");
        }
    }
}
