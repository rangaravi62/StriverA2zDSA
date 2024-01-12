package src.BasicMath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllDivisors {

    public static void main(String[] args) {
        System.out.println(allDivOptimal(36));
    }

    //TC -> 0(N/2) == 0(N)
    static List<Integer> allDivisorsOfANum(int num){
        List<Integer> allDivisors = new ArrayList<>();
        for (int i = 1; i <=num/2; i++) {
            if (num%i==0) allDivisors.add(i);
        }
        allDivisors.add(num);
        return allDivisors;
    }


    //TC -> 0(sq(N)+nlogn) where n is num of factors, can reduce it to 0(n) if we use 2 lists and copy one in another
    static List<Integer> allDivOptimal(int num){
        List<Integer> allDivisors = new ArrayList<>();
        int sq = (int) Math.sqrt(num);
        for (int i = 1; i <=sq; i++) {
            if (num%i==0) {
                allDivisors.add(i);
                if(i!=num/i) allDivisors.add(num/i);
            }
        }
        Collections.sort(allDivisors);
        return allDivisors;
    }
}
