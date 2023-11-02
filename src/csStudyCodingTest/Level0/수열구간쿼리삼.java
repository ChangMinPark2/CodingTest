package csStudyCodingTest.Level0;

import java.util.Arrays;

public class 수열구간쿼리삼 {
    public int[] solution(int[] arr, int[][] queries) {

        int[] answer = arr.clone();

        for(int i = 0; i < queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int c = 0;

            c = answer[a];
            answer[a] = answer[b];
            answer[b] = c;
        }
        return answer;
    }
}
