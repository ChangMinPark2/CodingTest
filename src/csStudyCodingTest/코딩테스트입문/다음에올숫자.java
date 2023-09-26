package csStudyCodingTest.코딩테스트입문;

/**
 등차, 등비인지 알아야한다. common의 크기는 2부터 시작하므로
 [2] - [1] == [2] - [1] 이 같다면 등차수열이다.
 등비수열이라면, [2] / [1]의 규칙의 등비수열이다
 **/

public class 다음에올숫자 {

    public int solution(int[] common) {
        int answer = 0;
        if(common[2] - common[1] == common[1] - common[0]){
            answer = common[common.length - 1] + (common[1] - common[0]);
        } else{
            answer = common[common.length - 1] * (common[2] / common[1]);
        }
        return answer;
    }
}
