import java.util.*;
public class Pattern1recursive {
    public void pattern(int n,int i){
        if(i>n) return;
        System.out.println("*".repeat(n));
        pattern(n,i+1);
    }

    public static void main(String[] args){
        Pattern1recursive myObj = new Pattern1recursive();
        myObj.pattern(5,0);
    }
}
