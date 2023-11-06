package csStudyCodingTest.Level0;
import java.util.*;

public class 이의영역 {

    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                list.add(i);
            }
        }

        if(list.size() == 0) return new int[]{-1};

        int start = list.get(0);
        int end = list.get(list.size() - 1);

        answer = Arrays.copyOfRange(arr, start, end + 1);

        return answer;
    }
}
