package csStudyCodingTest.Level1;

import java.util.Arrays;

/**
 * d -> 부서별 필요 금액을 담아둠
 * budget -> 총 예산
 * 딱 떨어지는데, 최대의 수를 리턴
 */
public class 예산 {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int i = 0; i<d.length; i++){
            if (d[i] <=budget){
                answer++;
                budget -=d[i];
            }

            if (budget <=0){
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] d = {1, 3, 2, 5, 4};
        int bud = 9;
        System.out.println(solution(d,bud));
    }
}
