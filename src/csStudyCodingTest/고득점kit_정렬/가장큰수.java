package csStudyCodingTest.고득점kit_정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 원소가 2자리 이상의 숫자라면, 숫자 하나 하나 씩을 배열 or list에 담아서 정렬한다.
 */
public class 가장큰수 {
    public static String solution(int[] numbers) {
        String[] repo = new String[numbers.length];
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<numbers.length; i++){
            repo[i] = String.valueOf(numbers[i]);
        }
        //TODO : Collections정렬 람다식 다시 공부하기 : 혁준 왈 문자열이라 다름
        Arrays.sort(repo, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        if (repo[0].equals("0")){
            return "0";
        }
        for (int i = 0; i < repo.length; i++){
            sb.append(repo[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int[] a = {6, 10, 2};
        System.out.println(solution(a));
    }
}
