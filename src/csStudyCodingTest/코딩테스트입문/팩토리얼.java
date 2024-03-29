package csStudyCodingTest.코딩테스트입문;

public class 팩토리얼 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 10; i > 0; i--){
            if(fac(i) <= n){
                answer = i;
                break;
            }
        }
        return answer;
    }

    private int fac(int n){
        if(n == 1) return 1;
        return n * fac(n-1);
    }
}
