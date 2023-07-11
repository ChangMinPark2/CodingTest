
package csStudyCodingTest.고득점kit_스택큐;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 1. 실행 대기 큐에서 대기중인 프로세스 하나를 꺼냅니다.
 * 2. 큐에 대기중인 프로세스 중 우선순위가 더 높은 프로세스가 있다면 방금 꺼낸 프로세스를 다시 큐에 넣습니다.
 * 3. 만약 그런 프로세스가 없다면 방금 꺼낸 프로세스를 실행합니다.
 * 3-1. 한 번 실행한 프로세스는 다시 큐에 넣지 않고 그대로 종료합니다.
 * ex) 프로세스 4개 [A,B,C,D] [2,1,3,2] -> C D A B
 * priorities -> 중요도가 순서대로 담긴 배열,
 * location -> 몇 번째로 실행되는지 알고싶은 프로세스의 위치를 알려주는 배열
 * 제한사항 -> 숫자가 클 수록 우선순위가 높다.
 * */

public class 프로세스 {
    public static int solution(int[] priorities, int location) {
        int answer = 0;

        //높은순이기 때문
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i : priorities){
            queue.add(i);
        }

        while (!queue.isEmpty()){
            for (int i = 0; i< priorities.length; i++){
                if (priorities[i] == queue.peek()){
                    queue.poll();
                    answer++;

                    if (i == location)
                        return answer;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {2, 1, 3, 2};
        int l = 2;

        System.out.println((solution(a, l)));
    }
}
