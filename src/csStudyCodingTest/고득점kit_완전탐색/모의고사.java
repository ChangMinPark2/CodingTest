package csStudyCodingTest.고득점kit_완전탐색;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * answers -> 정답
 * 1번 -> 1, 2, 3, 4, 5 순으로 찍는다.
 * 2번 -> 2, 1, 2, 3, 2, 4, 2, 5 순으로 찍느다.
 * 3번 -> 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 순으로 찍는다.
 * 시간복잡도 N 수포자의 수 M(3) -> 10000 * 3 = 30000 < 100000000 (완전 탐색 가능)
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
    public int[] solution2(int[] answers) {
        int[] corrects = new int[3];
        int max = 0;

        for (int problem = 0; problem < answers.length; problem++){
            int answer = answers[problem];

            for (int person = 0; person < 3; person++){
                int picked = getPicked(person, problem);
                if (answer == picked){
                    if (++corrects[person] > max){
                        max = corrects[person];
                    }
                }
            }
        }

        final int maxCorrects = max;
        return IntStream.range(0,3)
                .filter(i -> corrects[i] == maxCorrects)
                .map(i -> i + 1)
                .toArray();
    }

    //수포자들의 규칙을 나타내는 2차원 배열 상수
    private static final int[][] RULES = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5},
    };

    private int getPicked(int person, int problem){
        int[] rule = RULES[person];
        int index = problem % rule.length;
        return rule[index];
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 4};
        System.out.println(Arrays.toString(solution(a)));
        System.out.println(2%5);
    }
}
