package csStudyCodingTest.Level1;

import java.util.*;

public class 같은숫자는싫어 {
//        public int[] solution(int []arr) {
//
//            Stack<Integer> stack = new Stack<>();
//
//            for (int i=0; i<arr.length; i++){
//                if (stack.size() ==0 || arr[i] != stack.peek())
//                    stack.push(arr[i]);
//            }
//
//            int[] answer = new int[stack.size()];
//
//            for (int i= stack.size()-1; i>=0; i--){
//                answer[i] = stack.pop();
//            }
//            return answer;
//        }
    public static int[] solution(int []arr){

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int[] answer = new int[set.size()];
        int index = 0;

        for (int num : set) {
            answer[index++] = num;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 2, 2, 2, 3, 4, 4};
        System.out.println(Arrays.toString(solution(a)));
    }
}
