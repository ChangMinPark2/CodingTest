package csStudyCodingTest.Level0;
/**
 true인 항만 더한다.
 등차수열 a부터 시작해서 d만큼 더한다. (정의)

 배열 선언 후 등차수열을 만들어준다.
 answer += true인 것만 해준다.

 **/

public class 등차수열특별한항만더하기 {

    public int solution(int a, int d, boolean[] included) {

        int answer = 0;

        for(int i = 0; i < included.length; i++){
            if(included[i]){
                answer += a + (i * d);
            }
        }

        return answer;
    }
}
