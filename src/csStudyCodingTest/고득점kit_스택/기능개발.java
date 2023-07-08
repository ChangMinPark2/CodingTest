package csStudyCodingTest.고득점kit_스택;

import java.util.*;

public class 기능개발 {
    /**
     * progresses -> 현재 진행도 %
     * speeds -> 하루에 가능한 진행도 % ex) 1일경우 하루에 1%가능
     * 각 기능은 100%일때 배포, 뒤에 있는 기능이 먼저 개발 될 경우 앞에 있는 기능이 개발될때 같이 배포된다.
     * {93, 35, 55} {1, 30, 5} return 2, 1
     * */
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i<progresses.length; i++){
            if ((100 - progresses[i]) % speeds[i] != 0)
                queue.add((100 - progresses[i]) / speeds[i] + 1);
            else queue.add((100 - progresses[i]) / speeds[i]);
        }

        List<Integer> list = new ArrayList<>();

        int x = queue.poll();
        int count = 1;
        while (!queue.isEmpty()){
            if (x >= queue.peek()){
                count++;
                queue.poll();
            } else {
                list.add(count);
                count = 1;
                x = queue.poll();
            }
        }

        list.add(count);
        answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {93, 35, 55};
        int[] b = {1, 30, 5};
        System.out.println(solution(a, b));
    }
}
