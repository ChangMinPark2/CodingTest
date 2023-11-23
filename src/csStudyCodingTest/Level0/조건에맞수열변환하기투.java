package csStudyCodingTest.Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class 조건에맞수열변환하기투 {
    public int solution(int[] arr) {
        int answer = 0;
        int count = 0;
        int[] newArr = new int[arr.length];

        while (count != arr.length) {
            count = 0;
            newArr = arr.clone();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && arr[i] >= 50) {
                    arr[i] /= 2;
                } else if (arr[i] % 2 != 0 && arr[i] < 50) {
                    arr[i] = arr[i] * 2 + 1;
                }
                if (arr[i] == newArr[i]) {
                    count++;
                }
            }
            answer++;
        }

        return answer - 1;
    }
}
