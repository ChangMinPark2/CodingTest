package csStudyCodingTest.고득점kit_스택큐;

import java.util.Arrays;
import java.util.Stack;

/***
 * [1,1,3,3,0,1,1]	[1,3,0,1]
 */
public class 같은숫자는싫어 {

    public static int[] solution(int []arr) {
        int[] answer = {};

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i<arr.length; i++){
            if (stack.size() == 0 || arr[i] != stack.peek()){



                stack.push(arr[i]);
            }
        }
        answer = new int[stack.size()];

        for (int i= stack.size() - 1; i>=0; i--){
            answer[i] = stack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 5};

        System.out.println(Arrays.toString(solution(arr)));
    }
}
