package csStudyCodingTest.코딩테스트입문;

import java.util.ArrayList;
import java.util.List;

public class 배열회전시키기 {
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        if (direction.equals("right")){
            list.add(numbers[numbers.length - 1]);
            for (int i = 0; i < numbers.length - 1; i++){
                list.add(numbers[i]);
            }
        } else {
            for (int i = 1; i < numbers.length; i++){
                list.add(numbers[i]);
            } list.add(numbers[0]);
        }

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(solution(a, "right"));
    }
}
