package csStudyCodingTest.코딩테스트입문;

public class 세균증식 {
    public static int solution(int n, int t) {
        int answer = 0;

        answer = n * (int)Math.pow(2,t);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(7, 15));
    }
}
