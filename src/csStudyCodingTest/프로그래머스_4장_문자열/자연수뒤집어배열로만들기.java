package csStudyCodingTest.프로그래머스_4장_문자열;

import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {
    public static int[] solution(long n) {
        int[] answer = {};

        String str = String.valueOf(n); // "12345"
        System.out.println(str);
        String reversed = new StringBuilder(str).reverse().toString(); //"54321"

        answer = new int[reversed.length()];

        for (int i = 0; i < reversed.length(); i++){
            answer[i] = reversed.charAt(i) - '0';
        }

        return answer;
    }

    public static void main(String[] args) {
        long a = 12345;
        System.out.println(Arrays.toString(solution(a)));
    }
}
