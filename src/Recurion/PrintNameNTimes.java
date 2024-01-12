package src.Recurion;

public class PrintNameNTimes {
    public static void main(String[] args) {
        printNameNTimes(5,0);
    }


    //TC -> 0(N)
    static void printNameNTimes(int n, int count){
        if (count == n) return;
        System.out.println("Ravi");
        printNameNTimes(n,count+1);
    }

    //TC -> 0(N)
    static void printNameNTimesUsingOneParam(int n){
        if (n == 0) return;
        System.out.println("Ravi");
        printNameNTimesUsingOneParam(n-1);
    }
}
