package csStudyCodingTest.Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 뒤에서5위로 {
    public int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(num_list);
        for (int i = 5; i<num_list.length; i++){
            list.add(num_list[i]);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
