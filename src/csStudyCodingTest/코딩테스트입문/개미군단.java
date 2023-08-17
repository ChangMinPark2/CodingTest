package csStudyCodingTest.코딩테스트입문;

public class 개미군단 {
    public int solution(int hp) {
        int answer = 0;
        if (hp % 5 == 0){
            answer = hp / 5;
        } else if (hp % 5 == 4 || hp % 4 == 2){
            answer = hp / 5 + 2;
        } else answer = hp / 5 + 1;
        return answer;
    }
    //1, 2, 3, 4
}
