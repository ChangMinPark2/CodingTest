package csStudyCodingTest.고득점kit_스택;

import java.util.Stack;

public class 올바른괄호 {
    static boolean solution(String s) {
        /**
         * 효율테스트 실패 ( 시간 초과 )
         * */
        Stack<String> stackS = new Stack<>();
        String[] str = s.split("");

        boolean answer = true;

       for (int i=0; i< str.length; i++){
           if (str[i].equals("(")){
               stackS.push(str[i]);
           } else if (stackS.size()>0 && str[i].equals(")")){
               stackS.pop();
           } else {
               answer = false;
               break;
           }
       }

       if (!stackS.isEmpty()){
           answer = false;
       }
        return answer;
    }

    boolean solution2(String s) {
        boolean answer = false;
        int count = 0;

        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) == '('){
                count++;
            } else if (s.charAt(i) == ')') {
                count--;
            }
            if (count < 0){
                break;
            }
        }

        if (count == 0){
            answer = true;
        }


        return answer;
    }



    public static void main(String[] args) {
        String s = "(()(";
        System.out.println(solution(s));
    }
}
