package csStudyCodingTest.코딩테스트입문;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 겹치는선분의길이 {
    public int solution(int[][] lines) {
        int answer = 0;

        int[] arr = new int[200];

        for(int[] i : lines){
            int start = i[0] + 100;
            int end = i[1] + 100;

            for(int j = start; j < end; j++){
                arr[j] += 1;
            }
        }

        for(int i : arr){
            if(i > 1) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(Arrays.toString(arr));
    }


}
