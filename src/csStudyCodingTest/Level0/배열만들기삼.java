package csStudyCodingTest.Level0;
import java.util.*;

public class 배열만들기삼 {

    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < intervals.length; i++){
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++){
                list.add(arr[j]);
            }
        }

        answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}
