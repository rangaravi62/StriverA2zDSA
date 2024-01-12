package src.Recurion;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 5;
        if(num >= 1){
            System.out.println(0);
        }
        if(num >= 2){
            System.out.println(1);
        }
        printFibSeries(num,0,1,2);
    }

    static void printFibSeries(int num,int one, int two,int n){
        if (n == num)
            return;
        System.out.println(one+two);
        printFibSeries(num,two,one+two,n+1);

    }

}
