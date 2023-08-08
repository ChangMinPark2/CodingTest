package csStudyCodingTest.Level0;

import java.util.*;

public class n개의간격의원소들 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<num_list.length; i+=n){
            list.add(num_list[i]);
        }
        answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
