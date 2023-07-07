package csStudyCodingTest.Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열뒤집기 {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for (int i=0; i<num_list.length; i++){
            answer[i] = num_list[num_list.length - i - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] answer = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(answer)));
    }
}
