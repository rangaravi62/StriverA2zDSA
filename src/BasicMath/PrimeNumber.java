package src.BasicMath;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrimeOpt(9));
    }


    //TC -> 0(N)
    static boolean isPrime(int num){
        if(num>1) {
            for (int i = 2; i < num; i++) {
                if (num%i==0) return false;
            }
            return true;
        }
        return false;
    }

    //TC -> 0(sq(N))
    static boolean isPrimeOpt(int num){
        int sq = (int) Math.sqrt(num);
        if(num>1) {
            for (int i = 2; i <=sq; i++) {
                if (num%i==0) return false;
            }
            return true;
        }
        return false;
    }




}
