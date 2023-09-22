package csStudyCodingTest.코딩테스트입문;

/**
 1. array[]배열을 String 배열로 치완한다.
 2. String을 매개변수로, 7의 갯수를 반환해주는 함수를 만들어준다.
 3. String 배열을 반복문을 돌려 함수에 대입해서 answer에 더해준다.
 **/

import java.util.*;

public class 칠의개수 {

    public int solution(int[] array) {
        int answer = 0;

        String[] str = Arrays.stream(array)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        for (int i = 0; i < str.length; i++){
            answer += isSeven(str[i]);
        }

        return answer;
    }

    private int isSeven(String a){
        int count = 0;

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == '7'){
                count++;
            }
        }

        return count;
    }
}
