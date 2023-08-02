package csStudyCodingTest.고득점kit_정렬;

import java.util.Arrays;

/**
 * hIndex -> 과학자의 생산성과 영향력을 나타내는 지표
 * 한 과학자의 발표한 논문 n편 중, h번 이상 인용된 논문이 h번 이상이고, 나머지 논문이 h번 이하 인용되었다면
 * h의 최댓값이 이 과학자의 hIndex이다.
 * [] citations -> 발표한 논문의 인용 횟수를 담은 배열
 * ex)) 3, 0, 6, 1, 5 -> 3
 * 3번 이상 -> 3개 3번 이하 -> 2개
 * 1, 2, 3, 4, 5 || 1, 5, 10, 20, 30 홀수의 경우 : 3, 10
 * 1, 2, 3, 4, 5, 6 || 1, 5, 10, 20, 30, 40 : 4, 20
 * 1, 1, 2, 2, 2 같은 n이 있다면? -> 2
 */
public class hIndex {
    public static int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);
        for (int i = 0; i<citations.length; i++){
            int h = citations.length - i;
            if (citations[i] >= h){
                answer = h;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println(solution(citations));
    }
}
