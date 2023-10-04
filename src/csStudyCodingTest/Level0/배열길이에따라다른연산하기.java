package csStudyCodingTest.Level0;

import java.util.*;
//level 0
public class 배열길이에따라다른연산하기 {

    public int[] solution(int[] arr, int n) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr.length % 2 == 0){
                if(i % 2 == 1){
                    list.add(arr[i] + n);
                } else{
                    list.add(arr[i]);
                }
            } else{
                if(i % 2 == 0){
                    list.add(arr[i] + n);
                } else{
                    list.add(arr[i]);
                }
            }
        }

        answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}
