package csStudyCodingTest.Level0;
import java.util.*;

public class 뒤에서5등까지 {

    public int[] solution(int[] num_list) {
        int[] answer = {};

        Arrays.sort(num_list);
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            list.add(num_list[i]);
        }

        answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}
