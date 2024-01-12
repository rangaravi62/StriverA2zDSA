package src.BasicMath;

public class IntPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }

    //TC -> 0(N)
    static boolean isPalindrome(int num){
        if (ReverseANum.revANum(num) == num) return true;
        else return false;
    }
}
