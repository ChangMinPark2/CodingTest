package csStudyCodingTest.Level0;

/**
 * arr 리스트 만든다.
 * 이중반복문을 통해 i 와 j 가 같다면 i 를 remove한다.
 */
import java.util.*;

public class 배열의원소삭제하기 {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }

        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j<delete_list.length;j++) {
                if (arr[i] == delete_list[j]) {
                    list.remove(Integer.valueOf(arr[i]));
                }
            }
        }

        answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}
