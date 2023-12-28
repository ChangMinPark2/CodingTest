package csStudyCodingTest.Level0;

import java.util.*;

public class 문자열묶기 {

    public int solution(String[] strArr) {
        int[] count = new int[30];

        for (int i = 0; i < strArr.length; i++) {
            count[strArr[i].length() - 1]++;
        }

        int answer = 0;

        for (int max : count){
            if (answer < max){
                answer = max;
            }
        }

        return answer;
    }
}
