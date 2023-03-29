package csStudyCodingTest.Level1;

import java.util.Arrays;

//입력받은 n정수를 내림차순으로 정렬
public class 정수내림차순배치 {
    public long solution(long n) {
        String str = String.valueOf(n);
        char[] repo = str.toCharArray();
        Arrays.sort(repo);
        String answer = new StringBuilder(new String(repo)).reverse().toString();

        return Long.valueOf(answer);
    }
}
