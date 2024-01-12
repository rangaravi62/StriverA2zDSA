package src.BasicMath;

public class GcdOrHcf {
    public static void main(String[] args) {
        System.out.println(gcd(12,48));
    }

    static int bruteGcd(int num1,int num2){
        int min = Math.min(num1, num2);
        for (int i = min; i >= 1 ;i--) {
            if (num1%i==0 && num2%i==0) return i;
        }
        return 1;
    }

    static int gcd(int a,int b){
        while(a>0&&b>0){
            if (a>b) a = a%b;
            else b = b%a;
        }
        if(a==0)return b;
        else return a;
    }
}
