package csStudyCodingTest.Level0;

import java.util.Arrays;

public class 배열만들기 {
    public int[] solution(int n, int k) {
        n /=k;
        int[] answer = new int[n];
        answer[0] = k;
        for(int i=1; i< n; i++){
            answer[i] = k * (i + 1);

        }
        return answer;
    }

    public static void main(String[] args) {
        배열만들기 a = new 배열만들기();
        System.out.println(Arrays.toString(a.solution(10, 3)));
    }
}
