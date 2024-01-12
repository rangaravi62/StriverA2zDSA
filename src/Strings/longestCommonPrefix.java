package src.Strings;

public class longestCommonPrefix {
    public static void main(String[] args) {

    }

    public String longestCommonPrefix(String[] str) {
        String lcp = "";
        int minLen = str[0].length();
        for(int i=0;i<str.length;i++){
            if(minLen>str[i].length()) minLen = str[i].length();
        }
        outer:for(int i=0;i<minLen;i++){
            char c = str[0].charAt(i);
            for(int j=1;j<str.length;j++){
                if(c != str[j].charAt(i)){
                    break outer; // using label , it will break the outer loop!!!
                }
            }
            lcp =lcp + c;
        }

        return lcp;
    }
}
