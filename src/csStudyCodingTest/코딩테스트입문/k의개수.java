package csStudyCodingTest.코딩테스트입문;

public class k의개수 {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for(int a = i; a <=j; a++){
            answer += iscontain(String.valueOf(a), k);
        }

        return answer;
    }

    private int iscontain(String a, int b){
        int answer = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == b + '0'){
                answer += 1;
            }
        }
        return answer;
    }
}
