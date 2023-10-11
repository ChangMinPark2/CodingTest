package csStudyCodingTest.프로그래머스_4장_문자열;

/**
 * 1. 정수를 3진법으로 변환
 * 2. 변환된 문자열 뒤집기
 * 3. 뒤집은 문자열을 정수로 변환
 */
public class 삼진법뒤집기 {

    public int solution(int n) {
        int answer = 0;

        String str = Integer.toString(n, 3);
        String reverse = new StringBuilder(str).reverse().toString();

        answer = Integer.parseInt(reverse, 3);

        return answer;
    }

    public static void main(String[] args) {
        int b = 10;
        String a = Integer.toString(b, 2);
        StringBuilder sb = new StringBuilder();
        sb.append(12345);
        sb.reverse();
        System.out.println(sb);
    }
}
