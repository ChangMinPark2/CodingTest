package csStudyCodingTest.Level0;

import java.util.*;

public class 무작위로케이의개수뽑기 {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (list.size() == k) {
                break;
            }
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }

        if(list.size() != k){
            for(int i = list.size(); i < k; i++){
                list.add(-1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
