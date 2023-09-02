package csStudyCodingTest.코딩테스트입문;

public class 합성수찾기 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++){
            if (isCheck(i)) answer++;
        }
        return answer;
    }

    private boolean isCheck(int n){

        int result = 0;

        boolean answer = false;

        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                result++;
            }
            if (result == 3){
                answer = true;
                break;
            }
        }
        return answer;
    }
}
