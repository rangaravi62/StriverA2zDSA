package src.Strings;

public class largestOddNumInAString {
    public static void main(String[] args) {
        String num = "468975343678643846";
        System.out.println(largestOddNum(num));
    }

    public static String largestOddNum(String num){
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i) % 2 ==1) return num.substring(0,i+1);
        }
        return "";

    }
}
