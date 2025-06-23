package hashing;

import java.util.*;
public class Hash4 {
    public static boolean hash(String[] names,String find){
        Set<String> set = new HashSet<>();
        for(String name:names){
            set.add(name);
        }
        return set.contains(find);

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the names: ");
        int n = 2;
        String[] arr = new String[n];
        for(int i = 0;i<n;i++){
            arr[i] = scan.next();
        }
        System.out.println("Enter the name to find");
        String find = scan.next();

        if(hash(arr,find)){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }


    }
}
