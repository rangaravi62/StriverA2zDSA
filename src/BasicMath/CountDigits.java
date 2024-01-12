package src.BasicMath;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigitsUsingString(12348));
    }

    // TC -> 0(N)
    static int countDigits(int num){
        int count = 0;
        while (num!=0){
            num = num/10;
            count++;
        }
        return count;
    }

    //TC -> 0(1)
    static int countDigitsUsingString(int num){
        return Integer.toString(num).length();
    }
}
