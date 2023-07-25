package csStudyCodingTest.고득점kit_힙ㅡ우선순위큐;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 1. 열의 순으로 우선순위큐에 삽입한다.
 * 2.
 */
public class 디스크컨트롤러 {
    public static int solution(int[][] jobs) {
        int answer = 0;
        int end = 0;
        int index = 0;
        int count = 0;

        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);

        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        while (count < jobs.length) {

            while (index < jobs.length && jobs[index][0] <= end) {
                pq.add(jobs[index++]);
            }

            if (pq.isEmpty()) {
                end = jobs[index][0];
            } else {
                int[] temp = pq.poll();
                answer += temp[1] + end - temp[0];
                end += temp[1];
                count++;
            }
        }

        return (int) Math.floor(answer / jobs.length);
    }

    public static void main(String[] args) {
        int[][]a = {{0,3},{1,9},{2,6}};
        System.out.println(solution(a));
    }
}
