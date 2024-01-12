package src.BasicMath;

public class ArmStrongNum {
    public static void main(String[] args) {
        System.out.println(isArmStrongNum(153));
    }

    static boolean isArmStrongNum(int num){
        int dupNum = num;
        int len = CountDigits.countDigits(dupNum);
        int armNum = 0;
        for (int i = 0; i < len; i++) {
            armNum = (int) (armNum + Math.pow(dupNum%10,len));
            dupNum = dupNum/10;
        }
        return (num == armNum);
    }


}
