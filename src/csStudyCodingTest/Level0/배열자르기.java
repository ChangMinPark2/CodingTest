package csStudyCodingTest.Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열자르기 {
    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        for (int i=num1; i<=num2; i++){
            list.add(numbers[i]);
        }
        answer = new int[list.size()];

        for (int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(n, 1, 3)));
    }
}
