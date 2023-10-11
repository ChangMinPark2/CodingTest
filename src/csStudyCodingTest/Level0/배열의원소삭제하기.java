package csStudyCodingTest.Level0;

/**
 * arr 리스트 만든다.
 * 이중반복문을 통해 i 와 j 가 같다면 i 를 remove한다.
 */
import java.util.*;

public class 배열의원소삭제하기 {
    public static int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.size());
        System.out.println(arr.length);

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    list.remove(list.indexOf(arr[i]));
                }
            }
        }

        answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete = {94, 777, 104, 1000, 1, 12};

        System.out.println(Arrays.toString(solution(arr, delete)));
    }
}
