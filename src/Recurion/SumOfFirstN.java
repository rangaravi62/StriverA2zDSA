package src.Recurion;

public class SumOfFirstN {
    public static void main(String[] args) {
        System.out.println(sumOfFirstN(100));
    }

    //TC -> 0(N)
    static int sumOfFirstN(int n){
        if (n==0) return 0;
        return n+sumOfFirstN(n-1);
    }
}
