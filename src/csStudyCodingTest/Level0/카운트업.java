package csStudyCodingTest.Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 카운트업 {
    public static int[] solution(int start, int end) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = start; i<=end; i++){
            list.add(i);
        }
       answer = new int[list.size()];
        for (int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 10)));
    }
}
