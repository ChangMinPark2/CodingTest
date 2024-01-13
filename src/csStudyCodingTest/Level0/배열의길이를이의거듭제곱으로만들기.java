package csStudyCodingTest.Level0;

import java.util.*;

public class 배열의길이를이의거듭제곱으로만들기 {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int targetLength = 1;

        // targetLength가 n보다 작거나 같은 2의 거듭제곱을 찾음
        while (targetLength < n) {
            targetLength *= 2;
        }

        // 0을 추가하여 targetLength 길이의 배열 생성
        int[] answer = new int[targetLength];
        Arrays.fill(answer, 0);

        // arr의 요소들을 answer로 복사
        System.arraycopy(arr, 0, answer, 0, n);

        return answer;
    }

    public int[] solution2(int[] arr) {
        int length = 1;

        while (length < arr.length) {
            length *= 2;
        }

        return Arrays.copyOf(arr, length);
    }

    public void adsf(){
        while (true){
            if (true){
                System.out.println();
            }
        }
    }
}
