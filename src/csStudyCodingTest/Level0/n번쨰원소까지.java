package csStudyCodingTest.Level0;

import java.util.ArrayList;
import java.util.List;

public class n번쨰원소까지 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<n; i++){
            list.add(num_list[i]);
        }
        answer = new int[list.size()];
        for (int i = 0; i< list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
    public int[] solution2(int[] num_list, int n) {
        int[] answer = new int[n];
        for (int i = 0; i<n; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}
