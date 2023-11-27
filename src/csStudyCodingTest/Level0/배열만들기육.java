package csStudyCodingTest.Level0;

import java.util.*;

public class 배열만들기육 {

    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int index = 0;

        while (index < arr.length) {
            if (list.isEmpty()) {
                list.add(arr[index]);
                index++;
            } else if (list.get(list.size() - 1) == arr[index]) {
                list.remove(list.size() - 1);
                index++;
            } else if (list.get(list.size() - 1) != arr[index]) {
                list.add(arr[index]);
                index++;
            }
        }

        if (list.isEmpty()) {
            list.add(-1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0};
        System.out.println(solution(arr));
    }
}
