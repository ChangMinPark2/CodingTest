package csStudyCodingTest.Level0;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 배열원소의길이 {
    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i=0; i<strlist.length; i++){
            answer[i] = strlist[i].length();
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] a = {"We", "are", "the", "world!"};
        System.out.println(Arrays.toString(solution(a)));
    }
}
