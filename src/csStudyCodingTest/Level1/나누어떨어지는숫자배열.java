package csStudyCodingTest.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//arr [5,9,7,10], divisor 5 return 5, 10
public class 나누어떨어지는숫자배열 {
    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        for (int i=0; i < arr.length; i++){
            if (arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        if (list.size() == 0){
            list.add(-1);
        }
        answer = new int[list.size()];

        for (int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        System.out.println(Arrays.toString(solution(arr,5)));
    }
}
