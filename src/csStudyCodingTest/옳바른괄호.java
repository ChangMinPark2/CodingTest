package csStudyCodingTest;

import java.util.Stack;

//(, )로만 이루어진 문자열을 보낼 때
//문자열 S가 옳바르면 true, 틀리면 false
public  class 옳바른괄호 {
    public static boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length();i++){
            char a = s.charAt(i);

            if (a == '('){
                stack.push(a);
            }

            if(a == ')'){
                if (stack.isEmpty()){
                    return false;
                }
                else stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("(())("));
    }
}
