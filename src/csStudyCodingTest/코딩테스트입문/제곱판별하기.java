package csStudyCodingTest.코딩테스트입문;

public class 제곱판별하기 {
    public static int solution(int n) {
        int answer = 2;
        for (int i = 1; i<n/2; i++){
            if (i * i == n){
                answer = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1));
    }
}
