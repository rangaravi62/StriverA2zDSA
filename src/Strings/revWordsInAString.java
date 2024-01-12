package src.Strings;

public class revWordsInAString {
    public static void main(String[] args) {
        String str = " Ravi is   a good boy ";
        StringBuilder revString = new StringBuilder();
        String strArr[] = str.trim().split("\\s+");
        for(int i=strArr.length-1;i>=0;i--){
            revString.append(strArr[i]).append(" ");
        }
        System.out.println(revString.deleteCharAt(revString.length()-1));
    }
}
