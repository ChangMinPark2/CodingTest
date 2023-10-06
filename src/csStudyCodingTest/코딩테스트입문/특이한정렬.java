package csStudyCodingTest.코딩테스트입문;

import java.util.*;
import java.util.stream.*;

public class 특이한정렬 {
    public int[] solution(int[] numlist, int n) {
        List<Point> answer = new ArrayList<>();

        for (int i = 0; i < numlist.length; i++) {
            int current = numlist[i];
            answer.add(new Point(current, Math.abs(n - current)));
        }

        return answer.stream()
                .sorted()
                .mapToInt(p -> p.v)
                .toArray();
    }

    public static class Point implements Comparable<Point> {
        int v;      // value : 배열에 해당하는 값들
        int d;      // distance : 차이 (절댓값)

        public Point(int v, int d) {
            this.v = v;
            this.d = d;
        }

        @Override
        public int compareTo(Point o) {
            // distance 값이 같으면 실제 값으로 내림차순
            if (this.d == o.d) {
                return o.v - this.v;
            }

            // distance 기준으로 오름차순
            return this.d - o.d;
        }
    }
}
