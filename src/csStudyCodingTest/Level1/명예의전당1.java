package csStudyCodingTest.Level1;

import java.util.*;
public class 명예의전당1 {

    public static int[] solution(int k, int[] score) {

        int[] answer = new int[score.length];

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            // score 추가
            list.add(score[i]);

            // rank 리스트의 크기가 k보다 크면 가장 낮은 점수 제거
            if (list.size() > k) {
                list.remove(Collections.min(list));
            }

            // 남은 점수 중 가장 작은 점수 answer에 담기
            answer[i] = Collections.min(list);
        }
        return answer;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] arr = {10, 100, 20, 150, 1, 100, 200};

        System.out.println(solution(k, arr));
    }
}
