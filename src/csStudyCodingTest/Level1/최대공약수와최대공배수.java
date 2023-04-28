package csStudyCodingTest.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 최대공약수와최대공배수 {
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int big = Math.max(n,m);
        int small = Math.min(n,m);

        answer[0] = method(big, small);
        answer[1] = big * small / answer[0];

        return answer;
    }

    static int method(int a, int b){
        if (a%b==0){
            return b;
        }
        return method(b, a%b);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2,5)));
    }
}
