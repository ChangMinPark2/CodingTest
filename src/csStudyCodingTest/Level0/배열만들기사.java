package csStudyCodingTest.Level0;
import java.util.*;

public class 배열만들기사 {

    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack();
        int index = 0;

        while(true){
            if(stack.isEmpty()){
                stack.push(arr[index]);
                index++;
            } else {
                if(stack.peek() < arr[index]){
                    stack.push(arr[index]);
                    index++;
                } else if (stack.peek() >= arr[index]){
                    stack.pop();
                }
            }
            if(index == arr.length) break;
        }

        return stack.stream().mapToInt(i -> i).toArray();

    }
}
