package csStudyCodingTest.Level0;

import java.util.Arrays;

public class 분수의덧셈 {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int Tdemon = denom1 * denom2;
        int Tnum = (numer1 * denom2) + (numer2 * denom1);
        int temp = 1;
        for (int i = 1; i<=Tdemon && i<=Tnum; i++){
            if (Tdemon % i == 0 && Tnum % i == 0){
                temp = i;
            }
        }
        answer[1] = Tdemon / temp;
        answer[0] = Tnum/ temp;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(1, 2, 3, 4)));
    }
}
