package src.BasicMath;

public class ReverseANum {
    public static void main(String[] args) {
        System.out.println(revANumUsingString(1234));
    }


    // TC -> 0(N)
    static int revANum(int num){
        int revNum = 0;
        while (num!=0){
            int digit = num%10;
            revNum = revNum*10+digit;
            num = num/10;
        }
        return revNum;
    }

    //0(1)
    static int revANumUsingString(int num){
        StringBuilder str = new StringBuilder(Integer.toString(num));
        String revStr = String.valueOf(str.reverse());
        return Integer.parseInt(revStr);
    }
}
