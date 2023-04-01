package csStudyCodingTest.Level1;

import java.util.Arrays;

public class 없는숫자더하기 {
    public static int solution(int[] numbers) {
        int totalSum = 45;

        for (int i : numbers) {
            totalSum -= i;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int[] a = {5, 8, 4, 0, 6, 7, 9};
        System.out.println(solution(a));
    }
}


