package stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {

    private boolean solution(String n){
        Deque<Character> stack = new ArrayDeque<>();

        for(char c : n.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            }

            if (c == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

}
