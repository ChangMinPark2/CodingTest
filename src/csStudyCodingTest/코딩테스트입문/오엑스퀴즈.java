package csStudyCodingTest.코딩테스트입문;

import java.util.Arrays;
//0,2,4
public class 오엑스퀴즈 {
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++){
            String[] str = quiz[i].split(" ");

            int n1 = Integer.parseInt(str[0]);
            int n2 = Integer.parseInt(str[2]);
            int n3 = Integer.parseInt(str[4]);

            if (str[1].equals("+") && n1 + n2 == n3){
                answer[i] = "O";
            } else if (str[1].equals("-") && n1 - n2 == n3){
                answer[i] = "O";
            } else answer[i] = "X";
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] a = {"3 - 4 = -3", "5 + 6 = 11"};
        System.out.println(Arrays.toString(solution(a)));
    }
}
