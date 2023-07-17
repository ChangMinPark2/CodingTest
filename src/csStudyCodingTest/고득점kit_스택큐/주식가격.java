package csStudyCodingTest.고득점kit_스택큐;

import java.util.Arrays;

public class 주식가격 {
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i=0; i< prices.length; i++){
            for (int j = i+1; j<answer.length; j++){
                answer[i]++;

                if (prices[i] > prices[j]) break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[]a = {1, 2, 3, 2, 3};

        System.out.println(Arrays.toString(solution(a)));
    }
}
