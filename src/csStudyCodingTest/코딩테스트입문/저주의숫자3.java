package csStudyCodingTest.코딩테스트입문;

public class 저주의숫자3 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++){
            answer++;
            while(answer % 3 == 0 || String.valueOf(answer).contains("3")){
                answer++;
            }
        }
        return answer;
    }
}
