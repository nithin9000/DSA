public class Pattern2recusive {
    public void pattern2rec(int i,int n){
        if(i>n) return;
        System.out.println("*".repeat(i));
        pattern2rec(i+1,n);
    }
    public static void main(String[] args){
        Pattern2recusive myObj = new Pattern2recusive();
        myObj.pattern2rec(1,5);

    }
}
