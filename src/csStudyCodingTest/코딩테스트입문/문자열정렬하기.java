package csStudyCodingTest.코딩테스트입문;

import java.util.Arrays;

public class 문자열정렬하기 {
    public static String solution(String my_string) {
        String answer = "";

        StringBuilder sb = new StringBuilder();

        answer = my_string.toLowerCase();

        char[] a = answer.toCharArray();

        Arrays.sort(a);

        for (char c : a){
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("Bcad"));
    }
}
