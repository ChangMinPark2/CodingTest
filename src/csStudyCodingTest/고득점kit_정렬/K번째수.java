package csStudyCodingTest.고득점kit_정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class K번째수 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i<commands.length; i++){
            for (int j = commands[i][0]; j<=commands[i][1]; j++){
                list.add(array[j - 1]);
                Collections.sort(list);
            }
            answer[i] = list.get(commands[i][2] - 1);
            list.clear();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] array = {{2,5,3}, {4,4,1}, {1,7,3}};
        int[] ar = {1, 5, 2, 6, 3, 7, 4};
        System.out.println(Arrays.toString(solution(ar, array)));
        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.toString(array[1]));

    }
}
