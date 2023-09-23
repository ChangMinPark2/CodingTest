package csStudyCodingTest.코딩테스트입문;
/**
 가장 긴 변의 길이는  << 두 변의 합보다 작아야한다.

 1. 주어진 배열의 최댓값이 가장 긴 변의 삼각형일 경우 X
 경우의 수는 남은 한 변 + 가장 긴 변까지의 갯수

 2. 나머지 한 변이 가장 긴 변인 경우는   O
 max보다 크도 합보다 작은 갯수
 **/
import java.util.*;

public class 삼각형의완성조건투 {
    public int solution(int[] sides) {
        int answer = 0;

        Arrays.sort(sides);
        int sum = sides[0] + sides[1];

        //sides[1] 이 가장 긴 변인 경우
        for(int i = 1; i <= sides[1]; i++){
            if(sides[0] + i > sides[1]){
                answer++;
            }
        }
        //둘다 가장 긴 변이 아닌 경우

        for(int i = sides[1]; i < sum - 1; i++){
            answer++;
        }

        return answer;
    }
}
