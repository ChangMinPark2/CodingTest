package csStudyCodingTest.Level0;

import java.util.Arrays;

public class 간단한식계산하기 {
    public static int solution(String binomial) {
        int answer = 0;
        String[] a = binomial.split(" ");
        int first = Integer.parseInt(a[0]);
        int second = Integer.parseInt(a[2]);
        if (a[1].equals("+")){
            answer = first + second;
        } else if (a[1].equals("-")){
            answer = first - second;
        } else answer = first * second;
        return answer;
    }

    public static void main(String[] args) {
        String a = "43 + 12";
        System.out.println(solution(a));
    }
}
