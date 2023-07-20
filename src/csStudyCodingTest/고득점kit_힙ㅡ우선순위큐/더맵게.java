package csStudyCodingTest.고득점kit_힙ㅡ우선순위큐;

import java.util.PriorityQueue;

public class 더맵게 {
    public static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : scoville){
            pq.add(i);
        }

        while (!pq.isEmpty()){
            if (pq.peek() < K){
                if (pq.size() < 2) {
                    return -1;
                }
                int first = pq.poll();
                int second = pq.poll();
                pq.add(first + (second * 2));
                answer++;
            } else break;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {12, 2, 3, 4, 10, 5};
        System.out.println(solution(a, 200));
    }

}
