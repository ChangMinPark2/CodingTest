package csStudyCodingTest.Level0;

import java.util.*;

public class 배열의원소만큼추가하기 {
    public List solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}
