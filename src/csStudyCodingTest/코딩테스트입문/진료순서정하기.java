package csStudyCodingTest.코딩테스트입문;

import java.util.*;

public class 진료순서정하기 {

    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < emergency.length; i++){
            for(int j = 0; j < emergency.length; j++){
                if(emergency[i] <= emergency[j]){
                    answer[i] += 1;
                }
            }
        }

        return answer;
    }
}

