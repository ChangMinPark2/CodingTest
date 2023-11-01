package csStudyCodingTest.Level0;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 true 일 경우 list.add(arr[i]) 를 arr[i] 번.
 false 일 경우 -> list.remove(arr[i])의 개수만큼.
 **/

public class 빈배열추가삭제하기 {

    public int[] solution(int[] arr, boolean[] flag) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++){
            if (flag[i]){
                for (int j = 0; j < arr[i] * 2; j++){
                    stack.push(arr[i]);
                }
            } else {
                for (int z = 0; z < arr[i]; z++){
                    stack.pop();
                }
            }
        }

        return stack.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
