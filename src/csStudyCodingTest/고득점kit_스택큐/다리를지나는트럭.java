package csStudyCodingTest.고득점kit_스택큐;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * bridge_length -> 다리에 최대 올라갈 수 있는 트럭의 수
 * weight -> 다리는 최대 weight이하의 무게만큼 견딜 수 있다.
 * [] truck_weight -> 순서별 트럭의 각 무게
 */
public class 다리를지나는트럭   {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int count = 0;

        Queue<Integer> q = new LinkedList<>();
        for (int i : truck_weights) q.add(i);

        while (!q.isEmpty()){
            int x = q.poll();
            count++;
            answer++;
            //다리에 있는 조건
            if (q.peek() == null){
              answer ++;
              break;
            } else if (x + q.peek() <= weight && count <= bridge_length){
                count--;
                answer++;
            } else { // 다리에 없고 건너는 조건
                count =-1;
                answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {7, 4, 5, 6};
        System.out.println(solution(2, 10, a));
    }
}
