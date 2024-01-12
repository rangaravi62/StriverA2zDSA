package src.Recurion;

public class NthFiboNum {
    public static void main(String[] args) {
        System.out.println(nthFiboNum(7));
    }

    static int nthFiboNum(int n){
        if (n==1 || n==2) return n-1;
        return nthFiboNum(n-1)+nthFiboNum(n-2);
    }
}
