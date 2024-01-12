package src.Recurion;

public class Print1ToN {
    public static void main(String[] args) {
        print1ToN(1,5);
    }

    //TC -> 0(N)
    static void print1ToN(int num,int n){
        if (num > n) return;
        System.out.println(num);
        print1ToN(num+1,n);
    }
}
