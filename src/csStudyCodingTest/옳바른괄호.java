package csStudyCodingTest;

import java.util.Stack;

//(, )로만 이루어진 문자열을 보낼 때
//문자열 S가 옳바르면 true, 틀리면 false
public  class 옳바른괄호 {
    public static boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for (Character a : s.toCharArray()){

            if (stack.isEmpty()) {
                stack.push(a);
            } else if (stack.isEmpty()) //스택에 값이 있으면
                return false;

            else {
                stack.pop(); // 닫힌 괄호라면
            }
        }

            if(!stack.isEmpty()){
                return false;
            }
            return stack.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(solution("((()))"));
    }
}

