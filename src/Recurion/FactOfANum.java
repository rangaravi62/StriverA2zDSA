package src.Recurion;

public class FactOfANum {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    //TC -> 0(N)
    static int fact(int n){
        if (n==0 || n==1) return 1;
        return n*fact(n-1);
    }
}
