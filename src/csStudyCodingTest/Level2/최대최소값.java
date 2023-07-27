package csStudyCodingTest.Level2;

import java.util.Arrays;

public class 최대최소값 {
        public static String solution(String s) {
           // s = "1 2 3 4";
            String answer = "";
            String[] a = s.split(" ");
            int[] b = new int[a.length];
            for (int i = 0; i<a.length; i++){
                b[i] = Integer.parseInt(a[i]);
            }
            Arrays.sort(b);

            answer = b[0] + " " + b[b.length - 1];

            return answer;
        }

    public static void main(String[] args) {

        solution("1 2 3 4");
        System.out.println(solution("-1 -2 -3 -4"));

    }

}
