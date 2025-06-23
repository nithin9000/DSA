package hashing;

import java.util.*;

public class Hash2 {
    public static int hashvalue(String value){
        int sum = 0;
        for(int i=0;i<value.length();i++){
            sum += value.charAt(i);
        }
        return sum%10;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println(hashvalue(name));
    }

}
