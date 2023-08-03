package csStudyCodingTest.고득점kit_완전탐색;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * answers -> 정답
 * 1번 -> 1, 2, 3, 4, 5 순으로 찍는다.
 * 2번 -> 2, 1, 2, 3, 2, 4, 2, 5 순으로 찍느다.
 * 3번 -> 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 순으로 찍는다.
 */
public class 모의고사 {
    public static int[] solution(int[] answers) {

        int[] answer = {};
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int oneCount = 0;
        int twoCount = 0;
        int threeCount = 0;

        for (int i = 0; i< answers.length; i++){
            if (one[i % 5] == answers[i]) oneCount++;
            if (two[i % 8] == answers[i]) twoCount++;
            if (three[i % 10] == answers[i]) threeCount++;
        }

        List<Integer> list = new ArrayList<>();

        int max = Math.max(Math.max(oneCount, twoCount), threeCount);
        if (max == oneCount) list.add(1);
        if (max == twoCount) list.add(2);
        if (max == threeCount) list.add(3);

        answer = new int[list.size()];

        for (int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 4};
        System.out.println(Arrays.toString(solution(a)));
        System.out.println(2%5);
    }
}
